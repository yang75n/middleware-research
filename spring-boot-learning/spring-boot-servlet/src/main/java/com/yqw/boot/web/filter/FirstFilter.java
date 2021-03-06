package com.yqw.boot.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * SpringBoot整合Filter 方式一
 * <filter>
 * <filter-name>FirstFilter</filter-name>
 * <filter-class>com.bjsxt.filter.FirstFilter</filter-class>
 * </filter>
 * <filter-mapping>
 * <filter-name>FirstFilter</filter-name>
 * <url-pattern>/first</url-pattern>
 * </filter-mapping>
 */
//@WebFilter(filterName="FirstFilter",urlPatterns={"*.do","*.jsp"})
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        System.out.println("进入Filter");
        arg2.doFilter(arg0, arg1);//调用FirstServlet
        System.out.println("离开Filter");
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }
}
