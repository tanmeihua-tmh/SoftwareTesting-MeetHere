package com.meethere.controller;

import com.meethere.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("ifLogin", true);
        return "index";
    }

    @RequestMapping("/signup")
    public String signUp(Model model){
        return "signup";
    }

    @GetMapping("/login")
    public String login(Model model) {

        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping("/news")
    public String news(Model model){
        return "news";
    }

    @RequestMapping("/news_list")
    public String news_list(Model model){
        return "news_list";
    }

    @RequestMapping("/venue")
    public String venue(Model model){
        return "venue";
    }

    @RequestMapping("/venue_list")
    public String venue_list(Model model){
        return "venue_list";
    }

    @RequestMapping("/message_list")
    public String message_list(Model model){
        return "message_list";
    }

    @RequestMapping("/order_place")
    public String order_place(Model model){
        return "order_place";
    }

    @RequestMapping("/order_manage")
    public String order_manage(Model model){
        return "order_manage";
    }

    @RequestMapping("/user_info")
    public String user_info(Model model){
        return "user_info";
    }

    @RequestMapping("/admin_index")
    public String admin_index(Model model){
        return "admin/admin_index";
    }

    @RequestMapping("/user_manage")
    public String user_manage(Model model){
        return "admin/user_manage";
    }

    @RequestMapping("/venue_manage")
    public String venue_manage(Model model){
        return "admin/venue_manage";
    }

    @RequestMapping("/reservation_manage")
    public String reservation_manage(Model model){
        return "admin/reservation_manage";
    }

    @RequestMapping("/news_manage")
    public String news_manage(Model model){
        return "admin/news_manage";
    }

    @RequestMapping("/message_manage")
    public String message_manage(Model model){
        return "admin/message_manage";
    }

    @RequestMapping("/news_edit")
    public String news_edit(Model model){
        return "admin/news_edit";
    }

    @RequestMapping("/venue_edit")
    public String venue_edit(Model model){
        return "admin/venue_edit";
    }
}
