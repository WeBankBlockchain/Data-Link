package com.webank.datalink.sync.pusher;

import com.webank.datalink.sync.BlockData;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public interface BlockPusher {

    boolean push(BlockData blockData);
}
