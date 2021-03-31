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
package com.webank.datalink.sync.upload.impl;

import com.webank.datalink.sync.dao.BlockDataDao;
import com.webank.datalink.sync.model.BlockInfo;
import com.webank.datalink.sync.upload.DataUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * FileStore
 *
 * @Description:
 * @Author: grayson
 * @Version 1.0
 * @Date: 2021-03-29 20:44
 **/
@Service
public class RocksdbUploader implements DataUpload<BlockInfo> {

    @Autowired
    private BlockDataDao blockDataDao;

    @Override
    public void uploadBlockData(BlockInfo blockData) {

    }
}
