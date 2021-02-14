package com.blz.moodanalyser;

public class MoodAnalyser
{
	String message;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message)
	{
		super();
		this.message = message;
	}

	public String analyseMood()
	{
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	
	
}
