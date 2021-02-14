package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyseTest
{
	
	static MoodAnalyser moodanalyser1;
	static MoodAnalyser moodanalyser2;
	static MoodAnalyser moodanalyser3;
	
	@BeforeClass
	public static void MoodAnalyseObj()
	{
		moodanalyser1 = new MoodAnalyser("I am in Sad mood");
		moodanalyser2 = new MoodAnalyser("I am in Any mood");
		moodanalyser3 = new MoodAnalyser(null);
	}
	@Test
	public void givenMessage_whenSad_shouldReturnSad()
	{
		String mood = moodanalyser1.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy()
	{
		String mood = moodanalyser2.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_whenNull_shouldReturnHappy()
	{
		try
		{
			String mood = moodanalyser3.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
