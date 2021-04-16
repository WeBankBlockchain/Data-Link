package com.webank.datalink.query.callback;

import com.webank.datalink.query.service.impl.AmopSelectService;
import org.fisco.bcos.sdk.amop.AmopMsgOut;
import org.fisco.bcos.sdk.amop.topic.AmopMsgIn;
import org.fisco.bcos.sdk.client.Client;


/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public class AmopCallback {

    private AmopSelectService amopSelectService;

    private Client client;

    public AmopMsgOut onMessage(AmopMsgIn in){
        return null;
    }

}
