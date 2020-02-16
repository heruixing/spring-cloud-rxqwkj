package com.rxqwkj.main.client;

import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.InterfaceService;
import com.rxqwkj.main.api.mapper.model.OauthClientDetails;
import com.rxqwkj.main.api.pojo.ResponseCode;
import com.rxqwkj.main.api.service.BaseClientRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

/**
 * Created by heruixing on 2018/4/9.
 */
@FeignClient(name = InterfaceService.SERVICE_NAME, fallback = BaseClientService.HystrixClientFallback.class)
public interface BaseClientService extends BaseClientRemoteService {

    class HystrixClientFallback implements BaseClientService {

        @Override
        public ResponseData<List<OauthClientDetails>> getAllClient() {
            return new ResponseData<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
        }
    }
}
