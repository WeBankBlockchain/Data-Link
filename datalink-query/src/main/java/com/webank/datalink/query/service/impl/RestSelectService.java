package com.webank.datalink.query.service.impl;

import com.webank.datalink.query.model.dto.rest.RestRequest;
import com.webank.datalink.query.model.dto.rest.RestResponse;
import com.webank.datalink.query.service.SelectService;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public class RestSelectService  implements SelectService<RestRequest, RestResponse>  {
    @Override
    public RestResponse select(RestRequest request) throws Exception {
        return null;
    }
}
