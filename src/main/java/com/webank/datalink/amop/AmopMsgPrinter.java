package com.webank.datalink.amop;

import org.fisco.bcos.sdk.amop.AmopCallback;
import org.fisco.bcos.sdk.amop.topic.AmopMsgIn;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/22
 */
public class AmopMsgPrinter extends AmopCallback {
    @Override
    public byte[] receiveAmopMsg(AmopMsgIn msg) {
        System.out.println(msg.getTopicType());
        System.out.println(msg.getTopic());
        System.out.println(msg.getMessageID());
        System.out.println(new String(msg.getContent()));
        return new byte[0];
    }
}
