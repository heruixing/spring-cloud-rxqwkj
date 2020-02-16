package com.rxqwkj.common.utils;

/**
 * Created by heruixing on 2018/5/12.
 */
public class UUID {

    public static String uuid32 () {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
