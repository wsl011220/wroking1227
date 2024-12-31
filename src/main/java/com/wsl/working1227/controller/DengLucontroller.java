package com.wsl.working1227.controller;

import com.wsl.working1227.entity.ZhangHao;
import com.wsl.working1227.service.DengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
//@ResponseBody
//@RequestMapping("/login")
public class DengLucontroller {

    @Autowired
    private DengluService dengluService;

    @GetMapping("/denglu")
    public String denglu(HttpServletRequest req,ZhangHao zhangHao) {


        ZhangHao zhangHao1=dengluService.dengLu(zhangHao.getName());
                  if (zhangHao1!=null&&zhangHao.getPassword().equals(zhangHao1.getPassword())){
//                      System.out.println("2");
                      HttpSession session = req.getSession(true);

                      // 设置过期时间
                      session.setMaxInactiveInterval(60 * 60);

                      // 设置登录到的用户名为参数
                      session.setAttribute("username", zhangHao.getName());

                      // 创建Cookie并存入JSESSIONID
                      Cookie cookie = new Cookie("JSESSIONID", session.getId());

                      // 设置Cookie过期时间
                      cookie.setMaxAge(60 * 60);

                      // 通过响应对象将Cookie发送到浏览器
//                      resp.addCookie(cookie);
                      System.out.println("成功");
                      return ("zhuye.html");
                  } else {
                      System.out.println("失败");
                      return ("denglu.html");
                  }
    };

@GetMapping("/zhuye")
public String zhuye() {
    System.out.println("44");
    return "zhuye.html";
         }

};



