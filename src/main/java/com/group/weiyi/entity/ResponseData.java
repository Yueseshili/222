package com.group.weiyi.entity;

import java.io.Serializable;

/**
 * ResponseData<T>
 *     作用： 1.作为返回tablebiaoge 依赖数据的封装
 *           2.作为接口返回json数据 的统一格式
 *             后续接口返回的数据都要使用 ResponseData<T> 封装 ，真正返回的数据内容 在 ResponseData的 data 属性
 *
 * @param <T>
 */
public class ResponseData<T> implements Serializable {

    /*
    *
    * code  msg  count  data
    *
    * */

    // 0 代表成功   其他1 2  代表失败
    // 因为照顾到了 layui 中的table表格 ，如果没有layui表格相关数据的返回 可以使用 0代表失败  1代表成功
    private int code;

    // 返回信息
    private String msg;

    // 返回总条数
    private int count;

   // List<Student>  可以替换T 类型
    // 返回的数据
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
