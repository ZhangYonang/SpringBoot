package com.wuhu.meizuview.service;

import com.wuhu.meizubeans.pojo.TbShopping;
import com.wuhu.meizubeans.vo.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("meizu-phone-provider")
public interface PhoneViewService {
    @GetMapping("/phone/list")
    ResultVO getPhoneList();
    @GetMapping("/phone/detail")
    ResultVO getPhoneDetail(@RequestParam("pid") Integer pid);
    @PostMapping("/phone/addShopping")
    ResultVO addShopping(TbShopping tbShopping);
    @GetMapping("/phone/shoppingList")
    ResultVO getShoppingList();
}
