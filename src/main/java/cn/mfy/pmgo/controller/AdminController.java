package cn.mfy.pmgo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.mfy.pmgo.result.JsonResult;
import cn.mfy.pmgo.result.ResultCode;

/** 
 * 管理接口：登录……等 
 * @author Mengfy
 * 
 */  
@RestController  
@RequestMapping("/admin")  
public class AdminController {  
  
    //@Value("${spring.profiles}")  
    //private String env;  
      
    private String userName = "admin";  
    private String pw = "pword";  
      
    /** 
     * 登录 
     * @param response：用于保存token到cookie中 
     * @param map：包含userName和password 
     * @return 
     */  
    @RequestMapping("/login")  
    public JsonResult login(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String, String> map) {  
        if(userName.equals(map.get("userName")) && pw.equals(map.get("password"))){  
            return new JsonResult(ResultCode.SUCCESS, "登录成功！", null);  
        }else {  
            return new JsonResult(ResultCode.NOT_LOGIN, "登录失败！", null);  
        }  
    }  
}  
