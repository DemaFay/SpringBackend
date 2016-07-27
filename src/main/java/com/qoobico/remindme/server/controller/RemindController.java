package com.qoobico.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DemaFayz on 26.07.2016.
 */
@Controller
@RequestMapping("/reminder")
public class RemindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model) {
        return "May reminder";
    }
}
