package com.fhw.guliclassroom.common.practice.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:12
 */


public class CGLibDemo {
    static class Sister {
        public void sing() {
            System.out.println("I am tom, a little sister.");
        }
    }

    static class CGLibProxy implements MethodInterceptor {
        private Object target;

        public Object getInstance(Object target) {
            this.target = target;
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(this.target.getClass());
            enhancer.setCallback(this);
            return enhancer.create();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("introduce yourself...");
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("score...");
            return result;
        }

    }
}
