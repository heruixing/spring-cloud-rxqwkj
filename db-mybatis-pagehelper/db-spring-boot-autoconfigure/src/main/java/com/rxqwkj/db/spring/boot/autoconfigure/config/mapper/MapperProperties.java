package com.rxqwkj.db.spring.boot.autoconfigure.config.mapper;

import org.springframework.boot.context.properties.ConfigurationProperties;
import tk.mybatis.mapper.entity.Config;
/**
 * Created by heruixing on 2018/4/7.
 */
@ConfigurationProperties(prefix = "mapper")
public class MapperProperties extends Config{
}
