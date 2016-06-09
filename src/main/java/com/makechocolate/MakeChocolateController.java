package com.makechocolate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Sulton on 6/3/2016.
 */

@Controller
public class MakeChocolateController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String makeChocolate(Model model, HttpSession session) {
        return "home";
    }
}
