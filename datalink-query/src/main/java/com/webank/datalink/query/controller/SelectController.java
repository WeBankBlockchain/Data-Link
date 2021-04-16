package com.webank.datalink.query.controller;

import com.webank.datalink.query.model.dto.rest.RestRequest;
import com.webank.datalink.query.model.dto.rest.RestResponse;
import com.webank.datalink.query.service.impl.RestSelectService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
@RestController
public class SelectController {

    private  RestSelectService restSelectService;

    public RestResponse select(@RequestBody RestRequest request){
        return null;
    }

}
