package com.wade.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by spark on 17-10-25.
 * 类操作工具类
 */
public final class ClassUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(CastUtil.class);
    /**
     * 类加载器
     */
    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }
    /**
     * 加载类
     */
    public static Class<?> loadClass(String className,boolean isInitialized){
        //TODO
    }
    /**
     * 获取指定包下的所有类
     */
    public static Set<Class<?>> getClassSet(String packageName){
        //TODO
    }
}
