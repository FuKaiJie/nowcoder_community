package com.nowcoder.community.util;

/**
 * @author FKJ
 * @create 2023-03-13 20:30
 */
public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENEITY_LIKE = "like:entity";

    //某个实体的赞
    //like:entity:entityType:entityId -> set(userId)
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENEITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

}