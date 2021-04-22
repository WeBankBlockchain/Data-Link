package com.webank.datalink.query.callback;

import com.webank.datalink.query.config.AmopConfig;
import com.webank.datalink.query.service.impl.AmopSelectService;
import lombok.extern.slf4j.Slf4j;
import org.fisco.bcos.sdk.amop.Amop;
import org.fisco.bcos.sdk.amop.AmopCallback;
import org.fisco.bcos.sdk.amop.AmopMsgOut;
import org.fisco.bcos.sdk.amop.topic.AmopMsgIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author wesleywang
 * @Description:
 * @date 2021/4/21
 */
@Service
@Slf4j
public class AmopCallBack {

    @Autowired
    private AmopConfig config;
    @Autowired
    private Amop amop;
    @Autowired
    private AmopSelectService selectService;

    @PostConstruct
    private void init() {
        AmopCallback cb = new AmopCallback() {
            @Override
            public byte[] receiveAmopMsg(AmopMsgIn msg) {
                AmopMsgOut msgOut;
                try {
                    msgOut = selectService.select(msg);
                    return msgOut.getContent();
                } catch (Exception e) {
                    log.error("selectService.select failed, reason :" ,e);
                }
                return null;
            }
        };
        amop.subscribeTopic(config.getTopic(), cb);
    }
}
