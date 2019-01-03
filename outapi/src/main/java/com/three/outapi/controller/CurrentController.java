package com.three.outapi.controller;

import com.three.outapi.model.pub.ReturnObject;
import com.three.outapi.service.CurrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File：CurrentController <br>
 * Created on 2019/1/3.
 * Title:  <br>
 * Description: <br>
 * Company: wondersgroup.com <br>
 *
 * @author 潘国忠
 * @version 1.0
 */
@RestController
@RequestMapping("/current")
public class CurrentController {
    @Autowired
    CurrentService currentService;
    @RequestMapping("/getFoods")
    public ReturnObject getFoods(){
        return currentService.getFoods();
    }
}
