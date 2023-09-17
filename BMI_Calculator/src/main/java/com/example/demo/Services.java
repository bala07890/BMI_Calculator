package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class Services 
{
	public static Map<Integer, User> userList = new HashMap<>();
	private static int userId = 1000;
	
	public User addUserDetails(User user) 
	{
		user.setUserId(++userId); 
		userList.put(userId, user); 
		return user; 
	}
	
	public double calculateBMI(User user) 
	{

		double height = user.getHeight();
		double weight = user.getWeight();

		return Math.ceil((100 * 100 * weight) / (height * height));
	}

	public String getBMIStatus(double bmi)
	{
       String output="";
		if (bmi <=18.5)
			output= "underweight";

		if (bmi>18.5 && bmi <=25)
			output= "normal";

		if (bmi>25 && bmi <=30)
			output="overweight";
		if(bmi>30)
		    output="obese";
		
		return output;
	}


}
