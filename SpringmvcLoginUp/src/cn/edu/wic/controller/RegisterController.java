package cn.edu.wic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cn.edu.wic.Dao.UserDao;
import cn.edu.wic.controller.bean.Register;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
    private UserDao userDao;
     
	@RequestMapping(method =RequestMethod.GET)
	public String get(){
		return "register";
	}
	
    @RequestMapping(method=RequestMethod.POST)
	public String post(@Valid @ModelAttribute Register register,BindingResult errors){
    	if(!register.getPassword().equals(register.getPasswordRepeat())){
    		errors.addError(new FieldError("register", "passwordRepeat", "两次输入不一致"));
    	}
    	if(errors.hasErrors()){
    		return "register";
    	}
    	
    	userDao.save(register.toUser());
		return "register_success";
	}
}
