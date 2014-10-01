package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;

	public void addTweet(LonelyTweetModel lonelyTweetModel) {
		for(int i = 0; i < tweets.size(); i++){
			if (lonelyTweetModel.getText().equals(tweets.get(i).getText())){
					throw new IllegalArgumentException();
			}
		}
		tweets.add(lonelyTweetModel);
	}

	public TweetListModel() {
		super();
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		return tweets.size();
	}
	
	public ArrayList<LonelyTweetModel> getTweets() {
		
		Collections.sort(tweets, new Comparator<LonelyTweetModel>() {
	        public int compare(LonelyTweetModel  tweet1, LonelyTweetModel  tweet2)
	        {

	            return  tweet1.getTimestamp().compareTo(tweet2.getTimestamp());
	        }
	    });
		return tweets;
	}

}
