package com.rxqwkj.gateway.service;

import com.netflix.zuul.context.RequestContext;

/**
 * Created by heruixing on 2018/6/26.
 */
public interface LogSendService {

    /**
     * 往消息通道发消息
     * @param requestContext
     */
    void send(RequestContext requestContext);
}
