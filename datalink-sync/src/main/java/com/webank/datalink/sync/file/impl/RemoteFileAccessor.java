package com.webank.datalink.sync.file.impl;

import com.webank.datalink.sync.file.FileDAO;

import java.io.File;

/**
 * upload file through nginx
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
public class RemoteFileAccessor implements FileDAO {


    @Override
    public void publish(File data) {


        //TODO:copy temp file to nginx
    }
}
