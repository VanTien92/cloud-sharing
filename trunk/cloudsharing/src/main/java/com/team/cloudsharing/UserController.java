package com.team.cloudsharing;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.team.cloudsharing.User;

@RestController
public class UserController {
	Map<Integer, User> empData = new HashMap<Integer, User>();
	
	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
    public User getDummyEmployee() {
        User user = new User();
        user.setUserName("Nguyen Anh Tuan");
        empData.put(9999, user);
        return user;
    }
	
}
