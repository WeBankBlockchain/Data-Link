package com.webank.datalink.sync.file;

import com.webank.datalink.sync.model.BlockInfo;

import java.io.File;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public interface FileDAO {

    void publish(File data);

}
