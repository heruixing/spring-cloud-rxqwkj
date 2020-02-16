package com.rxqwkj.main.client;

import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.InterfaceService;
import com.rxqwkj.main.api.mapper.model.BaseModuleResources;
import com.rxqwkj.main.api.pojo.ResponseCode;
import com.rxqwkj.main.api.service.BaseModuleResourcesRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by heruixing on 2018/4/17.
 */
@FeignClient(name = InterfaceService.SERVICE_NAME, fallback = BaseModuleResourceService.HystrixClientFallback.class)
public interface BaseModuleResourceService extends BaseModuleResourcesRemoteService {

    class HystrixClientFallback implements BaseModuleResourceService{

        @Override
        public ResponseData<List<BaseModuleResources>> getMenusByUserId(@PathVariable("userId") String userId) {
            return new ResponseData<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
        }
    }
}
