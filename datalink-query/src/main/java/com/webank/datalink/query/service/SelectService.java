package com.webank.datalink.query.service;

import com.webank.datalink.query.model.SelectResponse;
import org.springframework.stereotype.Service;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
@Service
public interface SelectService<TIn, TOut> {

    TOut select(TIn request) throws Exception;

}
