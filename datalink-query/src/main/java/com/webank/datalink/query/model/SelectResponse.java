package com.webank.datalink.query.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
@Data
public class SelectResponse {
    private Set<String> columns;
    private List<Map<String, Object>> data;

}
