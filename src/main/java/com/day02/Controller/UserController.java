package com.day02.Controller;

import com.day02.Exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/exceptionTest")
    public String exceptionTest() throws SysException {
        System.out.println("Exception");
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("除0异常");
        }

        return "success";
    }
}
