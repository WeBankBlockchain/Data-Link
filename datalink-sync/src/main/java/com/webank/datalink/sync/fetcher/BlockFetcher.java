package com.webank.datalink.sync.fetcher;

import com.webank.datalink.sync.BlockData;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/26
 */
public interface BlockFetcher {

    public BlockData fetchBlock();

}
