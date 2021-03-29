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
package com.webank.datalink.controller;

import com.webank.datalink.model.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DataQueryController
 *
 * @Description:
 * @Author: grayson
 * @Version 1.0
 * @Date: 2021-03-29 19:42
 **/
@RestController
@RequestMapping("/query")
public class DataQueryController {

    @GetMapping("/{blockNum}")
    public CommonResponse getDataByBlockNum(@PathVariable("blockNum") Long blockNum){
        //TODO:
        return null;
    }
}
