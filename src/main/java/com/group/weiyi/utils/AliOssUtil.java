package com.group.weiyi.utils;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.Bucket;

import java.io.ByteArrayInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @program: Kataba
 * @description: 基于阿里云的oss 实现资源存储
 * @create: 2020-10-21 15:16
 */
public class AliOssUtil {

    //oss访问链接的有效期  默认1年
    public static final int OSS_TIME=1;//1年

    // Endpoint以杭州为例，其它Region请按实际情况填写。
    private static final String endpoint = "https://oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    private static final String accessKeyId = "LTAIdN2LGhwk7nKd";
    private static final String accessKeySecret = "d5tdDYSET3HiHOKmSZRtOtUPFxC7CJ";
    // BucketName 类似于文件夹
    public static final String BucketName = "zzjava-2006";
    private static OSS ossClient;
    static {
        // 创建OSSClient实例
        ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }
    //创建存储空间 创建文件夹
    public static boolean createBucket(String name){
        Bucket b=ossClient.createBucket(name);
        return b!=null;
    }
    //上传内容
    public static String uploadByte(String bucket,String objname,byte[] data){
        ossClient.putObject(bucket,objname,new ByteArrayInputStream(data));
        return getUrl(bucket, objname);
    }
    //删除文件
    public static boolean delObj(String bucketName,String objname){
        ossClient.deleteObject(bucketName, objname);
        return true;
    }
    //删除存储空间---不要删除存储空间
    public static boolean delBlu(String bucketName){
        ossClient.deleteBucket(bucketName);
        return true;
    }
    //创建访问地址
    public static String getUrl(String bucket,String objname){
        return ossClient.generatePresignedUrl(bucket,objname, addTime(OSS_TIME,1)).toString();
    }

    //针对时间
    public static Date addTime(int add, TimeUnit tu){
        Calendar calendar=Calendar.getInstance();

        switch (tu){
            case DAYS:calendar.add(Calendar.DAY_OF_MONTH,add);break;
            case MINUTES:calendar.add(Calendar.MINUTE,add);break;
            case SECONDS:calendar.add(Calendar.SECOND,add);break;
        }
        return calendar.getTime();
    }

    /**
     * 获取日期
     * @param add 要添加的日期
     * @param type 类型 1年  2月 3日*/
    public static Date addTime(int add, int type){
        Calendar calendar=Calendar.getInstance();

        switch (type){
            case 1:calendar.add(Calendar.YEAR,add);break;
            case 2:calendar.add(Calendar.MONTH,add);break;
            case 3:calendar.add(Calendar.DAY_OF_MONTH,add);break;
        }
        return calendar.getTime();
    }

}