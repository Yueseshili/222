package com.group.test;

import com.group.weiyi.utils.AliOssUtil;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 对象存储测试
 */
public class AliOssTest {


    /**
     * 创建对象存储对应 文件夹测试
     */
    @Test
    public void  createBucketTest(){

        // 在对存储中传感一个文件夹
        boolean result = AliOssUtil.createBucket("java2211");
        System.out.println("result = " + result);
    }


    /**
     * 上传文件
     * @throws IOException
     */
    @Test
    public void uploadFileToOss() throws IOException {



        // 上传图片 ，读取本地图片转换字节
        // 文件的输入流 --读取文件
        FileInputStream fis=new FileInputStream("C:\\Users\\hasee\\Desktop\\1.jpeg");

        // 文件输出流 ---向文件写入
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        // 字节数组
        byte[] data=new byte[1024];
        int len;
        //  fis.read(data) 读取文件的内容 放到自己数组 data中
        //  返回值len 就是读取到多少字节
        //  -1   代表文件读完了
        while ((len=fis.read(data))!=-1){
            // 向输出流写入 字节
            baos.write(data,0,len);
        }



        /**
         * String bucket,上传到哪一个文件夹
         * String objname, 上传文件的名字
         * byte[] data  上传文件的字节
         */
        String url = AliOssUtil.uploadByte("java2211", "1.jpeg", baos.toByteArray());

        System.out.println("url = " + url);

    }


}
