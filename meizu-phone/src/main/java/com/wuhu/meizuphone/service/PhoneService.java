package com.wuhu.meizuphone.service;

import com.wuhu.meizubeans.pojo.TbShopping;
import com.wuhu.meizubeans.vo.ResultVO;

public interface PhoneService {
    ResultVO getPhoneList();

    ResultVO getPhoneDetail(Integer pid);


    ResultVO addShopping(TbShopping tbShopping);

    ResultVO getShoppingList();
}
