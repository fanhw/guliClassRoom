package com.fhw.guliclassroom.common.practice.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 20:45
 */

@Component
public class MyHttpSessionListener implements HttpSessionListener {
    private static final Logger logger = LoggerFactory.getLogger(MyHttpSessionListener.class);
    /**
     * 记录在线的用户数量
     */
    public Integer count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("新用户上线了");
        count++;
        se.getSession().getServletContext().setAttribute("count", count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("用户下线了");
        count--;
        se.getSession().getServletContext().setAttribute("count", count);
    }
}
