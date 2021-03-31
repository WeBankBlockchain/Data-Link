package com.webank.datalink.query.model;

import java.util.List;
import java.util.Set;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public class SelectResponse {
    private Set<String> columns;
    private List<List<Object>> data;

    public Set<String> getColumns() {
        return columns;
    }

    public void setColumns(Set<String> columns) {
        this.columns = columns;
    }

    public List<List<Object>> getData() {
        return data;
    }

    public void setData(List<List<Object>> data) {
        this.data = data;
    }
}
