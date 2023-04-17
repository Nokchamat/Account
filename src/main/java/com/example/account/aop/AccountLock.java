package com.example.account.aop;


import java.lang.annotation.*;

@Target(ElementType.METHOD) // anotation을 붙일 타겟
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited // 상속 가능한 형태
public @interface AccountLock {
    long tryLockTime() default 5000L;
}
