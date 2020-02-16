package com.rxqwkj.main.provider.controller;


import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.mapper.model.StoreTatle;
import com.rxqwkj.main.api.pojo.ResponseCode;
import com.rxqwkj.main.provider.service.StoreTatleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Heruixing on 2019/10/16.
 */
@RestController
@RequestMapping("/store")
public class StoreTatleController {

    @Autowired
    private StoreTatleService storeTatleService;

    @ApiOperation(value = "获取商铺基础信息",notes = "基础信息")
    @PostMapping(value = "/getStoreTatle")
    public ResponseData<List<StoreTatle>> getStoreTatle(){
        List<StoreTatle> storeTatle = null;
        storeTatle = this.storeTatleService.selectAll();
        return new ResponseData<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), storeTatle);
    }

}
