package com.webank.datalink.sync.task;

import com.webank.datalink.sync.dao.impl.StashDbDao;
import com.webank.datalink.sync.upload.DataUpload;

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
