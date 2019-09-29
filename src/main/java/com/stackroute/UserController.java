package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {


    @RequestMapping("/welcome")
    public ModelAndView displayDetail(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("Satvik");
        String id = request.getParameter("176");
        String age = request.getParameter("23");
         User user1 = new User(name, id, age);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome.jsp");
        modelAndView.addObject("user", user1);
        return modelAndView;

    }
}
