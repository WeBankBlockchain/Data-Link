package com.webank.datalink.query;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public interface SqlTransalator<T> {

    String toSql(T request);

}
