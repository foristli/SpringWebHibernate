package org.learn.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object u, Errors err) {
		// TODO Auto-generated method stub
		User usr=(User) u;
		if(null==usr.getPassword()||"".equals(usr.getPassword()))
		{
			err.rejectValue("password", null,null,"password is null");
		}
		
	}

}
