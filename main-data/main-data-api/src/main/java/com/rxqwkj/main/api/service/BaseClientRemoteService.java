package com.rxqwkj.main.api.service;

import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.mapper.model.OauthClientDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by heruixing on 2018/5/18.
 */
public interface BaseClientRemoteService {

    @RequestMapping(value = "/client/all", method = RequestMethod.GET)
    ResponseData<List<OauthClientDetails>> getAllClient();

}
