package com.example.library.control;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.library.database.src.team.library.demo.*;

@RestController
public class IndexControl
{
    @RequestMapping(value = "/index")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/index");
        // mv.addObject("title", "啦啦啦");

        String id = new String("123");
        String passwd = new String("1234");
        boolean flag =new Reader().ReaderLogin(id,passwd);
        mv.addObject("title", flag);
        return mv;
    }
}