package com.itdr.config;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: TokenCache
 * 日期: 2020/2/19 15:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TokenCache {
    //LRU算法（超过最大值使用此算法）
    private static LoadingCache<String, String> localCache = CacheBuilder.newBuilder()
            .initialCapacity(1000)//初始化缓存项为1000
            .maximumSize(10000)//设置缓存项最大值不超过10000
            .expireAfterAccess(1, TimeUnit.HOURS)//定时回收
            .build(new CacheLoader<String, String>() {
                //当缓存中没有对应的值的时候执行load方法
                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });

    public static void set(String key, String value) {
        localCache.put(key, value);
    }

    public static String get(String key) {
        String value = null;
        try {
            value = localCache.get(key);
            if ("null".equals(value)) {
                return null;
            }
            return value;
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
