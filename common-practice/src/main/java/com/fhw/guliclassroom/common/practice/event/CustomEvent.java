package com.fhw.guliclassroom.common.practice.event;

import com.fhw.guliclassroom.common.practice.entity.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 19:17
 */


public class CustomEvent extends ApplicationEvent {
    private User user;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public CustomEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public CustomEvent(Object source) {
        super(source);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
