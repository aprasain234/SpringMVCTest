package com.ashishprasain.springmvctest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String home() {
        System.out.println("This is home");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String addPage(HttpServletRequest request, HttpSession session) {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;

        session.setAttribute("result", result);

        return "results.jsp";
    }
}
