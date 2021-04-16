package com.webank.datalink.query.service.impl;

import com.webank.datalink.query.service.SelectService;
import org.fisco.bcos.sdk.amop.AmopMsgOut;
import org.fisco.bcos.sdk.amop.topic.AmopMsgIn;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public class AmopSelectService implements SelectService<AmopMsgIn, AmopMsgOut> {

    @Override
    public AmopMsgOut select(AmopMsgIn request) throws Exception {
        return null;
    }
}
