package com.wuhu.meizuview.controller;

import com.wuhu.meizubeans.pojo.TbShopping;
import com.wuhu.meizubeans.vo.ResultVO;
import com.wuhu.meizuview.service.PhoneViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin//前后端分离：容易出现跨域问题
//跨域问题是因为破坏了同源协议(协议 地址 端口) 解决方案 添加@CrossOrigin注释

public class PhoneViewController {
    @Resource
    private PhoneViewService phoneViewService;
    @GetMapping("/phoneList")
    public ResultVO getPhoneList(){
       return phoneViewService.getPhoneList();
    }
    @GetMapping("/phoneDetail")
    public ResultVO getPhoneDetail(Integer pid){
        return phoneViewService.getPhoneDetail(pid);
    }
    @PostMapping("addShopping")
    public ResultVO addShopping(@RequestBody TbShopping tbShopping){
        return phoneViewService.addShopping(tbShopping);
    }
    @GetMapping("/shoppingList")
    public ResultVO getShoppingList(){
        return phoneViewService.getShoppingList();
    }
}
