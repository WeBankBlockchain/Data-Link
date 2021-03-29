package com.webank.datalink.sync.upload;

import com.webank.datalink.sync.model.BlockInfo;

public interface DataUpload<T> {

    public void uploadBlockData(T blockData);
}
