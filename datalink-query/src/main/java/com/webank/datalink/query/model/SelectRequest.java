package com.webank.datalink.query.model;

import java.util.List;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public class SelectRequest {

    private String op;

    private String table;

    private List<String> conditions;
}
