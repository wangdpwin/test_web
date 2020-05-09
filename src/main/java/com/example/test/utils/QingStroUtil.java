package com.example.test.utils;

import com.example.test.consts.QingStroConsts;
import com.qingstor.sdk.config.EvnContext;
import com.qingstor.sdk.exception.QSException;
import com.qingstor.sdk.service.Bucket;
import com.qingstor.sdk.service.Bucket.ListObjectsOutput;
import com.qingstor.sdk.service.QingStor;
import com.qingstor.sdk.service.QingStor.ListBucketsOutput;
import java.io.File;
import java.util.List;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/10 下午7:01
 * @Description 青云对象存储工具类
 * @Version 1.0
 */
public class QingStroUtil {

    private static EvnContext objectEvn = null;

    private static QingStor storService = null;

    static {
        objectEvn = new EvnContext(QingStroConsts.getAccessKeyId(), QingStroConsts.getSecretAccessKey());
        storService = new QingStor(objectEvn,QingStroConsts.getStorZone());
    }

    public Bucket createStroBucket() throws QSException {
        Bucket bucket = storService.getBucket(QingStroConsts.getUploadPath(), QingStroConsts.getStorZone());
        if(bucket==null){
            Bucket.PutBucketOutput putBucketOutput = bucket.put();
        }
        return bucket;
    }

    public ListBucketsOutput queryBucketsOutput() throws QSException {
        ListBucketsOutput listOutput = storService.listBuckets(null);
        return listOutput;
    }

    public ListObjectsOutput listAllObject(Bucket bucket) throws QSException {
        ListObjectsOutput listObjectsOutput = bucket.listObjects(null);
        return listObjectsOutput;
    }

    public void saveObject(Bucket bucket,String path,String name) throws QSException {
        Bucket.PutObjectInput input = new Bucket.PutObjectInput();
        File f = new File("test_file");
        input.setBodyInputFile(f);
        input.setContentType("text/plain");
        input.setContentLength(f.length());
        Bucket.PutObjectOutput putObjectOutput = bucket.putObject(name, input);
    }

    public void deleteObject(Bucket bucket,String name) throws QSException {
        Bucket.DeleteObjectOutput deleteObjectOutput = bucket.deleteObject(name);
    }

}
