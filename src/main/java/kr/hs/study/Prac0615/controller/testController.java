package kr.hs.study.Prac0615.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    // 1번
    @PostMapping("/test1")
    public String test1(@RequestParam("n") int n,
                        @RequestParam("m") int m,
                        Model model) {
        int sum=0;
        for(int i=n; i<=m; i++) {
            sum+=i;
        }
        model.addAttribute("sum", sum);
        return "result";
    }
}
