package com.blz.moodanalyser;

import org.junit.Assert;
//import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyseTest
{
	
	static MoodAnalyser m;
	
//	@BeforeClass
//	public static void MoodAnalyseObj()
//	{
//		moodanalyser1 = new MoodAnalyser("I am in Sad mood");
//		moodanalyser2 = new MoodAnalyser("I am in Any mood");
//		moodanalyser3 = new MoodAnalyser(null);
//	}
	
	@Test
	public void givenMessage_whenSad_shouldReturnSad()
	{
		m = new MoodAnalyser("I am in Sad mood");
		try
		{
			Assert.assertEquals("SAD", MoodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
		}
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy()
	{
		m = new MoodAnalyser("I am in Happy mood");
		try
		{
			Assert.assertEquals("HAPPY", MoodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenMessage_whenNull_shouldReturnHappy()
	{
		m = new MoodAnalyser(null);
		try
		{
			Assert.assertEquals("HAPPY",MoodAnalyser.analyseMood());
		}
		catch (MoodAnalysisException e) {
		}
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException_ReturnHappy()
	{
		m = new MoodAnalyser(null);
		try
		{
			MoodAnalyser.analyseMood();	
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Invalid mood. Enter a message", e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException_ReturnHappy()
	{
		m = new MoodAnalyser("");
		try
		{
			MoodAnalyser.analyseMood();	
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("This is an empty message. Enter other message", e.getMessage());
		}
	}
	
}
