package com.jiupai.payFrontSys.util;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by forvoid on 2016/12/3.
 */
public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        /*支持全域名访问*/
        httpResponse.addHeader("Access-Control-Allow-Origin", "*");

//        httpResponse.addHeader("Access-Control-Allow-Credentials","true");
//        httpResponse.addHeader("Access-Control-Request-Headers","Client-Sytle,User-Token" );
//        httpResponse.addHeader("Access-Control-Allow-Headers","Client-Sytle,User-Token" );
        /*支持http的动作，在自定义请求头的时候，会发送。。预请求。。，如果遇到跨域并且设置headers的请求，所有请求需要两部
        * 1、发送options预请求。
        * 2、服务器accepted第一步，浏览器执行第二步发送真正的请求
        * */
//        httpResponse.addHeader("Access-Control-Allow-Methods","POST,GET,DELETE");//OPTIONS,
        /*
        * 声明客户端自定义的请求头
        * */
//        httpResponse.addHeader("Access-Control-Allow-Headers","Client-Style,User-Token,X-Requested-With,Content-Type" );
        /*使客户端：可以操作自定义的数据*/
//        httpResponse.addHeader("Access-Control-Expose-Headers","User-Token");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
