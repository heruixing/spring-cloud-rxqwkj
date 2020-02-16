package com.rxqwkj.main.api.service;

import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.mapper.model.BaseModuleResources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by heruixing on 2018/4/16.
 */
public interface BaseModuleResourcesRemoteService {

    /**
     * 根据userId查询菜单
     * @param userId
     * @return
     */
    @RequestMapping(value = "/menu/user/{userId}", method = RequestMethod.GET)
    ResponseData<List<BaseModuleResources>> getMenusByUserId(@PathVariable("userId") String userId);
}
