package com.yang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/23:33
 */
@SuppressWarnings("all") // 抑制警告
public class IDUtiles {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
