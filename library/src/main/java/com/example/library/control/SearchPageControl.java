package com.example.library.control;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.library.database.src.team.library.demo.*;

import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@RestController
public class SearchPageControl
{
    @RequestMapping(value = "/SearchPage", method = RequestMethod.GET)
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/SearchPage");
        return mv;
    }

    // @RequestMapping(value = "/SearchPage", method = RequestMethod.POST) 
    // public void postRegister(ModelAndView mv, HttpServletRequest request, HttpServletResponse response)  throws IOException {

    // }
}