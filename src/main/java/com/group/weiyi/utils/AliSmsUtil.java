package com.group.weiyi.utils;


import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

import java.util.Random;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　 ┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　  ┃
 * 　　┃　　　　　　 ┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG!━━━━━━
 *
 * @Description:
 * @Author: 邢朋辉
 * @Date: 2022/6/23 12:20
 */
public class AliSmsUtil {
    //短信客户端对象
    private static Client client;
    //记录短信模板
    public static final String SMS_TEM_FIND="SMS_204975067";
    public static final String SMS_TEM_LOGIN="SMS_115250125";
    public static final String SMS_TEM_ADD="SMS_114390520";
    public static final String SMS_TEM_NOTICE="SMS_181550693";

    static {
        //创建配置对象
        Config config = new Config().setAccessKeyId("LTAI5tMKRSCxhpV4712HDeCF").setAccessKeySecret("TNBnmAJixOc8tRYNVDnIyKFuuRYMma");
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        try {
            client=new Client(config);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param code 验证码
     * @param phone 手机号
     * @return 发送是否成功*/
    public static boolean sendSmsCode(String phone,String code,String tem){
        //1.创建请求对象
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers(phone)
                .setSignName("来自邢朋辉的短信")
                .setTemplateCode(tem)
                .setTemplateParam("{\"code\":"+code+"}");

        RuntimeOptions runtime = new RuntimeOptions();
        try {
            // 复制代码运行请自行打印 API 的返回值
            SendSmsResponse response=client.sendSmsWithOptions(sendSmsRequest, runtime);
            return response.getStatusCode()==200;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    //生成随机数字，指定位数
    public static int randomNum(int len){
        Random random=new Random();

        //4 ：1000-9999 0-8999  +1000
        //9000  +1000
        double d=Math.pow(10,len-1);
        return random.nextInt((int)(Math.pow(10,len)-d))+(int)d;

    }

}
