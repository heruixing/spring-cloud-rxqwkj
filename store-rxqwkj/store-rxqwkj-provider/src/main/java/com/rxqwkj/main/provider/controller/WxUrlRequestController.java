package com.rxqwkj.main.provider.controller;

import com.rxqwkj.main.provider.component.WeChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Heruixing
 * @version 1.0.0
 * @description：
 * @ClassName：${class}
 * @Date 18:58 2020/2/12
 */
@RestController
@RequestMapping("/wx")
public class WxUrlRequestController {
    private final static Logger LOG = LoggerFactory.getLogger(WxUrlRequestController.class);
    /**
     * 接入微信服务
     * @param request
     * @param response
     */

    @RequestMapping(value="/urlR",method= RequestMethod.GET)
    public void index(HttpServletRequest request, HttpServletResponse response){
        WeChatService weChatService = new WeChatService();
        LOG.info("微信接入服务器");
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String token = "13312251777";
        String echostr = request.getParameter("echostr");
        if (weChatService.verifyInfo(signature, timestamp, nonce, token)) {
            LOG.info("echostr为:{}", echostr);
            if (echostr != null) {
                try {
                    response.getWriter().write(echostr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            LOG.info("signature为:{}", signature);
            LOG.info("timestamp为:{}", timestamp);
            LOG.info("nonce为:{}", nonce);
            LOG.info("token为:{}", token);
        }
    }
}
