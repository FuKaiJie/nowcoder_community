package com.nowcoder.community.util;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * @author FKJ
 * @create 2023-02-17 22:41
 */
public class CommunityUtil {

    //生成随机字符串
    public static String generrateUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5加密(只能加密，不能解密)
    //
    public static String md5(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
