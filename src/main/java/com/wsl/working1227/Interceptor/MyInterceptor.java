package com.wsl.working1227.Interceptor;

import com.wsl.working1227.entity.ZhangHao;
import com.wsl.working1227.service.DengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    /*
     * 进入controller方法之前调用
     *
     * true表示放行，false表示不放行
     */


    @Autowired
    private DengluService dengluService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {



        // 设置响应内容编码集
        response.setContentType("text/html;charset=utf-8");

        // 获取Session，注意一定要加false，不允许手动创建
        HttpSession session = request.getSession(false);

        // 判断：session为空，或者session中的username不为张三，说明没有登录
//        if (null == session || !"张三".equals(session.getAttribute("username"))) {
        if (null != session ) {
            // 登录成功
            return true;
        } else {
            // 登录失败
            return false;
        }
    }






    // 调用完controller之后，视图渲染之前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    // 页面跳转之后，整个流程执行之后，一般用于资源清理操作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}