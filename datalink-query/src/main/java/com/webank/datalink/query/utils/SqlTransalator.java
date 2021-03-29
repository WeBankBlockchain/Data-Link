package com.webank.datalink.query.utils;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public interface SqlTransalator<T> {

    String toSql(T request);

}
