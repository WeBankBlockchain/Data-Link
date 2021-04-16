package com.webank.datalink.query.handler;

import com.webank.datalink.query.dao.SqlExecutor;
import com.webank.datalink.query.model.SelectRequest;
import com.webank.datalink.query.model.SelectResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
@Slf4j
public class SelectHandler {

    @Autowired
    private SqlTranslateHandler sqlTranslateHandler;
    @Autowired
    private SqlExecutor sqlExecutor;

    public SelectResponse select(SelectRequest request) throws Exception {
        SelectResponse response = new SelectResponse();
        String conditionSql = sqlTranslateHandler.toSql(request);
        List<Map<String, Object>> data = sqlExecutor.execute(conditionSql,request);
        List<Map<String, Object>> allValues = new ArrayList<>();
        if (!data.isEmpty()) {
            log.debug("condition sql:{} has data", conditionSql);
            for (Map<String, Object> line : data) {
                Map<String, Object> map = new HashMap<>();
                for (String field : line.keySet()) {
                    map.put(field, line.get(field));
                }
                allValues.add(map);
            }
        } else {
            log.debug("condition sql:{} has no data", conditionSql);
        }
        response.setData(allValues);
        return response;
    }

}
