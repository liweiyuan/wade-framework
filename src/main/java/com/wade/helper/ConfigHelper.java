package com.wade.helper;

import com.wade.ConfigConConstant;
import com.wade.util.PropsUtil;

import java.util.Properties;

/**
 * Created by spark on 17-10-24.
 * 属性文件助手类
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS =
            PropsUtil.loadProps(ConfigConConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.JDBC_URL);
    }

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.JDBC_PASSWORD);
    }

    /**
     * 获取JDBC驱动
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取JDBC驱动
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.APP_JSP_PATH,
                "/WEB-INF/view/");
    }

    public static String getAppAsset() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConConstant.APP_ASSET_PATH,
                "/asset");
    }

}
