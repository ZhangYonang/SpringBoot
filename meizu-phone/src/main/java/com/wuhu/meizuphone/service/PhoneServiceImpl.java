package com.wuhu.meizuphone.service;

import com.wuhu.meizubeans.pojo.TbColor;
import com.wuhu.meizubeans.pojo.TbImage;
import com.wuhu.meizubeans.pojo.TbPhones;
import com.wuhu.meizubeans.pojo.TbShopping;
import com.wuhu.meizubeans.vo.ResultVO;
import com.wuhu.meizujdbc.dao.TbColorMapper;
import com.wuhu.meizujdbc.dao.TbImageMapper;
import com.wuhu.meizujdbc.dao.TbPhonesMapper;
import com.wuhu.meizujdbc.dao.TbShoppingMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Resource
    private TbPhonesMapper tbPhonesMapper;
    @Resource
    private TbColorMapper tbColorMapper;
    @Resource
    private TbImageMapper tbImageMapper;
    @Resource
    private TbShoppingMapper tbShoppingMapper;

    @Override
    public ResultVO getPhoneList() {
        List<TbPhones> tbPhoneList=tbPhonesMapper.selectAll();
        for(TbPhones tbPhones:tbPhoneList){
            //根据Id查询手机的Id
           List<TbColor> colors = tbColorMapper.getColorsByPid(tbPhones.getPid());

           for(TbColor tbColor:colors){
               //根据每一个颜色查询对应的所有图片
            List<TbImage> images = tbImageMapper.getImagesByCid(tbColor.getCid());
            tbColor.setImageList(images);
           }
            tbPhones.setColors(colors);
        }
        return ResultVO.getSuccessVo("success",tbPhoneList);
    }

    @Override
    public ResultVO getPhoneDetail(Integer pid) {
        //根据Id查询手机
        TbPhones tbPhone = tbPhonesMapper.selectByPrimaryKey(pid);
        List<TbColor> colors = tbColorMapper.getColorsByPid(tbPhone.getPid());
        for(TbColor c:colors){
            List<TbImage> images = tbImageMapper.getImagesByCid(c.getCid());
            c.setImageList(images);
        }
        tbPhone.setColors(colors);
        return ResultVO.getSuccessVo("success",tbPhone);
    }

    @Override
    public ResultVO addShopping(TbShopping tbShopping) {
        TbShopping ShoppingResult = tbShoppingMapper.getShoppingByPid(tbShopping.getPid());
        if(ShoppingResult==null){
            //之前没有加入购物车过
            tbShoppingMapper.insert(tbShopping);
        }else {
            ShoppingResult.setNum(ShoppingResult.getNum()+tbShopping.getNum());
            tbShoppingMapper.updateShoppingNum(ShoppingResult);
        }
        return ResultVO.getSuccessVo("success","购物车添加成功");
    }

    @Override
    public ResultVO getShoppingList() {
        List<TbShopping> tbShoppingList = tbShoppingMapper.selectAll();
        for(TbShopping tbShopping:tbShoppingList){
            TbPhones tbPhones = tbPhonesMapper.selectByPrimaryKey(tbShopping.getPid());
            tbShopping.setTbPhones(tbPhones);
        }
        return ResultVO.getSuccessVo("success",tbShoppingList);
    }


}
