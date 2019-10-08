package com.c2p.springbootaws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeResource {

	@RequestMapping(value="/getmsg",method=RequestMethod.GET)
	public String getMessage(){
		return "Hi Surjeet How are you?";
	}
}
