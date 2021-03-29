/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.datalink.sync.dao.impl;

import com.webank.datalink.sync.config.StashBdConfig;
import com.webank.datalink.sync.dao.BlockDataDao;
import com.webank.datalink.sync.handler.FileHandler;
import com.webank.datalink.sync.handler.SqlHandler;
import com.webank.datalink.sync.model.BlockInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * DbDao
 *
 * @Description:
 * @Author: grayson
 * @Version 1.0
 * @Date: 2021-03-29 21:53
 **/
@Service
public class DbDao implements BlockDataDao<BlockInfo> {

    @Autowired
    private StashBdConfig stashBdConfig;
    @Autowired
    private SqlHandler sqlHandler;

    //需要抽取的方法
    private List<Map<String, Object>> selectTableDataByNum(
            String table_name,
            Integer num,
            int preIndex,
            int pageSize){
        return null;
    }

    @Override
    public BlockInfo getBlockData() {
        //循环调用selectTableDataByNum获取数据并组装
        return null;
    }
}
