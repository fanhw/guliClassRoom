package com.fhw.guliclassroom.common.practice.event;

import com.fhw.guliclassroom.common.practice.entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 20:29
 */

@Component
public class MyEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        User user = event.getUser();
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
    }
}
