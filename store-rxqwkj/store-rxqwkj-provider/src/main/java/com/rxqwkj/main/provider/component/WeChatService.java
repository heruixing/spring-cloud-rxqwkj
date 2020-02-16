package com.rxqwkj.main.provider.component;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.TreeSet;
/**
 * @author Heruixing
 * @version 1.0.0
 * @description：
 * @ClassName：${class}
 * @Date 18:56 2020/2/12
 */
public class WeChatService {

    public Boolean verifyInfo(String signature, String timestamp, String nonce,
                              String token) {
        TreeSet<String> set = new TreeSet<String>();
        set.add(token);
        set.add(timestamp);
        set.add(nonce);
        StringBuilder sBuilder = new StringBuilder();
        for (String item : set) {
            sBuilder.append(item);
        }
        String sign = DigestUtils.sha1Hex(sBuilder.toString());
        return signature.equalsIgnoreCase(sign);
    }
}
