package com.wuhu.meizuphone.controller;

import com.wuhu.meizubeans.pojo.TbShopping;
import com.wuhu.meizubeans.vo.ResultVO;
import com.wuhu.meizuphone.service.PhoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/phone")
public class PhoneProviderController {
    @Resource
    private PhoneService phoneService;
    @GetMapping("/list")
    public ResultVO getPhoneList(){
        return phoneService.getPhoneList();
    }
    @GetMapping("/detail")
    public ResultVO getPhoneDetail(@RequestParam("pid") Integer pid){
        return phoneService.getPhoneDetail(pid);
    }
    @PostMapping("/addShopping")
    public ResultVO addShopping(@RequestBody TbShopping tbShopping){
        return phoneService.addShopping(tbShopping);
    }
    @GetMapping("/shoppingList")
    public ResultVO getShoppingList(){
        return phoneService.getShoppingList();
    }


}
