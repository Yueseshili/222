package com.group.test;


import com.group.weiyi.utils.AliSmsUtil;

/**
 * 短信验证码测试
 */
public class SmsTest {

    public static void main(String[] args) {





        /**
         * 参数1：向哪一个手机 发送验证码
         * 参数2:发送的验证码是 多少
         * 参数3 配置短信模板   AliSmsUtil.SMS_TEM_LOGIN
         */
        // 调用api 就会发送手机验证码


        // 产生随机验证码
        int code = AliSmsUtil.randomNum(6);
        System.out.println("code = " + code);

        // 发送随机验证码
        boolean result = AliSmsUtil.sendSmsCode("17857338105", code+"",  AliSmsUtil.SMS_TEM_LOGIN);

        System.out.println("result = " + result);



    }
}
