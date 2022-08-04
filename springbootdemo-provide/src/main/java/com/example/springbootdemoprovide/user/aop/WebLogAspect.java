//package com.example.springbootdemoprovide.user.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//
//@Aspect
//@Component
//@Order(-5)
//public class WebLogAspect {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 定义一个切入点.
     * <p>
     * 解释下：
     * <p>
     * <p>
     * <p>
     * ~ 第一个 * 代表任意修饰符及任意返回值.
     * <p>
     * ~ 第二个 * 任意包名
     * <p>
     * ~ 第三个 * 代表任意方法.
     * <p>
     * ~ 第四个 * 定义在web包或者子包
     * <p>
     * ~ 第五个 * 任意方法
     * <p>
     * ~ .. 匹配任意数量的参数.
     */

//    @Pointcut("execution(public * com.example.springbootdemoprovide.user.service.*.list(..))")
//    public void webLog() {
//    }
//
//    @AfterReturning("webLog()")
//    public void doAfterReturning(JoinPoint joinPoint) {

        // 处理完请求，返回内容

//        logger.info("WebLogAspect.doAfterReturning()");
//        System.out.println("222222222222222222222222222");

//    }

//}
