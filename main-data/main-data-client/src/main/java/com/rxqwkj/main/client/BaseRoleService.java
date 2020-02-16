package com.rxqwkj.main.client;

import com.rxqwkj.common.pojo.ResponseData;
import com.rxqwkj.main.api.InterfaceService;
import com.rxqwkj.main.api.mapper.model.BaseRole;
import com.rxqwkj.main.api.pojo.ResponseCode;
import com.rxqwkj.main.api.service.BaseRoleRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by heruixing on 2018/4/17.
 */
@FeignClient(name = InterfaceService.SERVICE_NAME, fallback = BaseRoleService.HystrixClientFallback.class)
public interface BaseRoleService extends BaseRoleRemoteService{

    class HystrixClientFallback implements BaseRoleService{

        @Override
        public ResponseData<List<BaseRole>> getRoleByUserId(@PathVariable("userId") String userId) {
            return new ResponseData<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
        }
    }
}
