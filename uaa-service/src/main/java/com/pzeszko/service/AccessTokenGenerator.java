package com.pzeszko.service;

import com.pzeszko.dto.OAuthRequest;
import com.pzeszko.dto.OAuthResponse;

/**
 * Created by Admin on 26.04.2017.
 */
public interface AccessTokenGenerator {

    OAuthResponse generateAccessToken(OAuthRequest oAuthRequest);
}
