package com.github.jwtsecurityspringbootstarter.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author a9043
 */
public interface JwtUser {
    Object getPrincipal();

    Object getCredentials();

    Collection<? extends GrantedAuthority> getGrantedAuthorities();
}
