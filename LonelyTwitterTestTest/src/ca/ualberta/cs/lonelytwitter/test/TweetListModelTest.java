package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import junit.framework.Assert;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	 public void testFiveIsFive(){
		 assertEquals(5, 5);
		 
	 }
	 
	 public void testTweeList() {
		 
		 TweetListModel tlm = new TweetListModel(); 
	 }
	 
	 public void testAddTweet() {
		 boolean flag1 = true;
		 
		 TweetListModel tlm = new TweetListModel(); 
		 tlm.addTweet(new LonelyTweetModel("test"));
		 assertTrue(tlm.getCount() == 1);
		 try { 
			 tlm.addTweet(new LonelyTweetModel("test"));
			 fail();
			 //assertFalse(true);
		
		 } catch (IllegalArgumentException e) {
			 //System.err.print("IllegalArgumentException: you added 2 of the same tweets!");
			 assertTrue(true);
			 
		 }
		
	 }
	 public void testGetTweets() {
		 TweetListModel tlm = new TweetListModel(); 
		 ArrayList<LonelyTweetModel> testTweets = tlm.getTweets();
		 for(int i = 1; i < testTweets.size(); i++){
			if (testTweets.indexOf(i--) > testTweets.indexOf(i)) {
				fail();
			}
		
		 }
	 }

}
