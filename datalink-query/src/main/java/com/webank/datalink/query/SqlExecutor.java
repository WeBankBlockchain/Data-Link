package com.webank.datalink.query;

import java.sql.SQLException;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public interface SqlExecutor {

    int execute(String sql) throws SQLException;

}
