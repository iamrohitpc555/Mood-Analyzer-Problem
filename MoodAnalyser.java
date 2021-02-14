package com.blz.moodanalyser;

public class MoodAnalyser
{
	static String message;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message)
	{
		super();
		MoodAnalyser.message = message;
	}

	public static String analyseMood() throws MoodAnalysisException
	{
		try
		{
			if(message.contains("Sad"))
				return "SAD";
		}
		catch (NullPointerException e)
		{
			if (message == null)
				throw new MoodAnalysisException("Invalid mood. Enter a message");
			else if(message == "")
				throw new MoodAnalysisException("This is an empty message. Enter other message");
		}
		return "HAPPY";
	}
	
}
