package com.example.test.consts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/10 下午7:05
 * @Description
 * @Version 1.0
 */
@Component
public class QingStroConsts {

    @Value("${qingcloud.accessKeyId}")
    private static String accessKeyId;

    @Value("${qingcloud.secretAccessKey}")
    private static String secretAccessKey;

    @Value("${qingstro.zone}")
    private static String storZone;

    @Value("${qingstro.test.upload}")
    private static String uploadPath;

    @Value("${qingstro.test.result}")
    private static String resultPath;

    public static String getAccessKeyId() {
        return accessKeyId;
    }

    public static String getSecretAccessKey() {
        return secretAccessKey;
    }

    public static String getStorZone() {
        return storZone;
    }

    public static String getUploadPath() {
        return uploadPath;
    }

    public static String getResultPath() {
        return resultPath;
    }
}
