package org.learn.basic.controller;

import org.learn.entity.User;
import org.learn.entity.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserControl {
	
	@InitBinder
    public void initBainder(DataBinder binder){
        binder.replaceValidators(new UserValidator());

    }
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(Model model)
	{
		model.addAttribute(new User());
		return "user/login";
	}
	
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Validated User user, BindingResult br){

        if (br.hasErrors()){
            return "user/login";
        }
        return "--";
    }


}
