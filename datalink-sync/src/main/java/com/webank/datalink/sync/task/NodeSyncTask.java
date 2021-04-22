package com.webank.datalink.sync.task;

import com.webank.datalink.sync.dao.impl.StashDbDao;
import com.webank.datalink.sync.upload.DataUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
@Service
public class NodeSyncTask {
    @Autowired
    private StashDbDao stashDbDao;

    @Autowired
    private DataUpload dataUpload;

    public void run() throws Exception {

    }
}
