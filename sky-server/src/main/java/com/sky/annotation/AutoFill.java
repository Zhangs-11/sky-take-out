package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description 自定义注解，用户标识某个方法需要进行公共字段自动填充
 * @Author zs
 * @CreateTime 2025-03-29 22-16
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 数据库操作类型枚举 INSERT UPDATE
    OperationType value();
}
