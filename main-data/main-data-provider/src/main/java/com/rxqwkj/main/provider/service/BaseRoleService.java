package com.rxqwkj.main.provider.service;

import com.rxqwkj.db.spring.boot.autoconfigure.service.BaseService;
import com.rxqwkj.main.api.mapper.model.BaseRole;
import com.rxqwkj.main.provider.mapper.mapper.BaseRoleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heruixing on 2018/4/9.
 */
@Service
public class BaseRoleService extends BaseService<BaseRole>{

    /**
     * 根据用户查询角色
     * @param userId
     * @return
     */
    public List<BaseRole> getRoleByUserId(String userId) {
        return ((BaseRoleMapper)mapper).getRoleByUserId(userId);
    }
}
