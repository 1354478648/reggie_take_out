package com.sues.common;

import lombok.extern.slf4j.Slf4j;

//基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
@Slf4j
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        log.info("当前线程id为：{}", threadLocal.get());
        return threadLocal.get();
    }
}
