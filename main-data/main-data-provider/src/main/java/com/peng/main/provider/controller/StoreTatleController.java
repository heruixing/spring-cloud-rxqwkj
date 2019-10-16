package com.peng.main.provider.controller;

import com.peng.common.pojo.ResponseData;
import com.peng.main.api.mapper.model.StoreTatle;
import com.peng.main.api.pojo.ResponseCode;
import com.peng.main.provider.service.StoreTatleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/10/16.
 */
@RestController
@RequestMapping("/store")
public class StoreTatleController {

    @Autowired
    private StoreTatleService storeTatleService;

    @PostMapping(value = "/getStoreTatle")
    public ResponseData<List<StoreTatle>> getStoreTatle(){
        List<StoreTatle> storeTatle = null;
        storeTatle = this.storeTatleService.selectAll();
        return new ResponseData<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), storeTatle);
    }

}
