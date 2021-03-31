package com.webank.datalink.query.callback;

import com.webank.datalink.query.service.impl.AmopSelectService;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public class AmopCallback implements AmopMsgCallback{

    private AmopSelectService amopSelectService;

    private Client client;

    public byte[] handle(AmopMsgIn in){
        return null;
    }

}
