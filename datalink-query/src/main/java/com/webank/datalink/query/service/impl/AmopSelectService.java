package com.webank.datalink.query.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webank.datalink.query.handler.SelectHandler;
import com.webank.datalink.query.model.Response;
import com.webank.datalink.query.model.SelectRequest;
import com.webank.datalink.query.model.SelectResponse;
import com.webank.datalink.query.service.SelectService;
import lombok.extern.slf4j.Slf4j;
import org.fisco.bcos.sdk.amop.AmopMsgOut;
import org.fisco.bcos.sdk.amop.topic.AmopMsgIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
@Component
@Slf4j
public class AmopSelectService implements SelectService<AmopMsgIn, AmopMsgOut> {

    @Autowired
    private SelectHandler selectHandler;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public AmopMsgOut select(AmopMsgIn msgIn) throws Exception {
        int resultCode = 0;

        SelectResponse resultData = null;
        SelectRequest request = objectMapper.readValue(msgIn.getContent(),
                SelectRequest.class);
        try {
            resultData = selectHandler.select(request);
        } catch (Exception e) {
            resultCode = -1;
            log.error("Process request error", e);
        }

        Response response = new Response();
        response.setCode(resultCode);
        response.setResult(resultData);

        String out = objectMapper.writeValueAsString(response);

        AmopMsgOut msgOut = new AmopMsgOut();
        msgOut.setContent(out.getBytes());
        msgOut.setTopic(msgIn.getTopic());
        msgOut.setType(msgIn.getTopicType());
        msgOut.setTimeout(6000);
        log.debug("Send response: {}", response.getResult());
        return msgOut;
    }
}
