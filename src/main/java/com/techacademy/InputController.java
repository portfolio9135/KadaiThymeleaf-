package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
                           //URLに「previous」というパラメータがある場合、その値をString型の変数「previous」にセットする
                           //required = falseの部分は、そのパラメータが必須では無いって意味
    public String getInput(@RequestParam(value = "previous", required = false) String previous, Model model) {
        if (previous != null) {
            model.addAttribute("previous", previous);
        }
        return "input";
    }
}
