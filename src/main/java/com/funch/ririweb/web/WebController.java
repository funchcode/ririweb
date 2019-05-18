package com.funch.ririweb.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/custom")
    public String custom() {
        return "layouts/pages/custom";
    }

    @GetMapping("/staff")
    public String staff() {
        return "layouts/pages/staff";
    }
}
