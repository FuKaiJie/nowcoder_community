package com.nowcoder.community.util;

/**
 * @author FKJ
 * @create 2023-02-20 16:53
 */
public interface CommunityConstant {

    //激活成功
    int ACTIVATION_SUCCESS = 0;

    //激活成功
    int ACTIVATION_REPEAT = 1;

    //激活成功
    int ACTIVATION_FAILURE = 2;

    //默认状态的登录凭证的超时时间
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    //记住状态下的登录凭证超时时间
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
}