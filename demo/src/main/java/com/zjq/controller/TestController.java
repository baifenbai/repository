package com.zjq.controller;
import com.zjq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IT-03 on 2017/10/11.
 */
@Controller
@RequestMapping("/zjq")
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/index")
    public String getIndex(Model model){
        String s =testService.getString();
        model.addAttribute("s",s);
        return "index";
    }
}
