package com.phone;

public class OperatingSystemFactory 
{

	public OS getInstance(String Str) 
	{
		if(Str.equals("Open"))
		return new Android();
		
		else if (Str.equals("closed"))
			return new IOS();
		
		else 
			return new Windows();
		
		
	}
}
