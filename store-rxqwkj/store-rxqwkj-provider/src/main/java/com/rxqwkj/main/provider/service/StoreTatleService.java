package com.rxqwkj.main.provider.service;

import com.peng.db.spring.boot.autoconfigure.service.BaseService;
import com.rxqwkj.main.api.mapper.model.StoreTatle;
import com.rxqwkj.main.provider.mapper.mapper.StoreTatleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Heruixing
 */
@Service
public class StoreTatleService  extends BaseService<StoreTatle> {

    @Autowired
    private StoreTatleMapper storeTatleMapper ;
}
