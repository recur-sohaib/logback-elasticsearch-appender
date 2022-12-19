package com.recur.logback.elasticsearch.config;

import java.net.HttpURLConnection;

import com.recur.logback.elasticsearch.util.Base64;

public class BasicAuthentication implements Authentication {
    public void addAuth(HttpURLConnection urlConnection, String body) {
        String userInfo = urlConnection.getURL().getUserInfo();
        if (userInfo != null) {
            String basicAuth = "Basic " + Base64.encode(userInfo.getBytes());
            urlConnection.setRequestProperty("Authorization", basicAuth);
        }
    }
}
