package com.wade.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by spark on 17-10-25.
 * 字符串工具类
 */
public final class StringUtil {
    /**
     * 判断字符串是否为空
     *
     * @param string
     * @return
     */
    public static boolean isEmpty(String string) {
        if (string != null) {

            string = string.trim();
        }
        return StringUtils.isEmpty(string);
    }

    /**
     *
     * @param string
     * @return
     */
    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }
}
