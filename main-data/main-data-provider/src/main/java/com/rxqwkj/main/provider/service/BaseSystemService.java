package com.rxqwkj.main.provider.service;

import com.rxqwkj.db.spring.boot.autoconfigure.service.BaseService;
import com.rxqwkj.main.api.mapper.model.BaseSystem;
import com.rxqwkj.main.api.pojo.response.ModuleAndSystemResponse;
import com.rxqwkj.main.provider.mapper.mapper.BaseSystemMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heruixing on 2018/4/9.
 */
@Service
public class BaseSystemService extends BaseService<BaseSystem>{
    public List<ModuleAndSystemResponse> selectModuleAndSystem() {
        return ((BaseSystemMapper)mapper).selectModuleAndSystem();
    }
}
