package com.three.outapi.service.impl;

import com.three.outapi.model.pub.ReturnObject;
import com.three.outapi.service.CurrentService;
import org.springframework.stereotype.Service;

/**
 * File：CurrentServiceImpl <br>
 * Created on 2019/1/3.
 * Title:  <br>
 * Description: <br>
 * Company: wondersgroup.com <br>
 *
 * @author 潘国忠
 * @version 1.0
 */
@Service
public class CurrentServiceImpl implements CurrentService {
    @Override
    public ReturnObject getFoods() {
        return new ReturnObject();
    }
}
