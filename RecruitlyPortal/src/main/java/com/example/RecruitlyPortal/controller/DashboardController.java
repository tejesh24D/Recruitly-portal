package com.example.RecruitlyPortal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // You can add attributes to the model to display in the dashboard
        return "dashboard"; // returns dashboard.jsp
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // returns login.jsp
    }
}
