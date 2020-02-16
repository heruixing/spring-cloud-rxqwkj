package com.rxqwkj.auth.provider.config.auth.token;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by heruixing on 2018/11/25.
 * 二维码Token
 */
public class QrAuthenticationToken extends MyAuthenticationToken {
    public QrAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public QrAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
