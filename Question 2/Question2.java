import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Question2 {

	/**
	 * @param args
	 */
	
	static HashMap<Integer, User> users = new HashMap<Integer, User>();
	static HashMap<String, Country> countryAvgWeightLoss = new HashMap<String, Country>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateLeaderBoard("US", 123, 175.5f);
		updateLeaderBoard("DE", 444, 203.0f);
		updateLeaderBoard("GB", 555, 164.5f);
		updateLeaderBoard("US", 123, 171.5f);
		updateLeaderBoard("DE", 444, 202.0f);
		updateLeaderBoard("GB", 555, 164.0f);
		
		
	}
	public static String updateLeaderBoard(String countryId, int userId, float newWeight)
	{
		
		if(users.containsKey(userId))
		{
			float weightDifference =users.get(userId).getWeight()-newWeight;
			float avgWeightLoss =countryAvgWeightLoss.get(countryId).getAvgWeightLoss();
			int numUsers =countryAvgWeightLoss.get(countryId).getUsers();
			float newAvgWeightLoss = (numUsers*avgWeightLoss+weightDifference)/numUsers;
			countryAvgWeightLoss.get(countryId).setAvgWeightLoss(newAvgWeightLoss);				
		
		}else{
			User newUser = new User(countryId,newWeight);
			users.put(userId, newUser);
			Country newCountry = new Country(1, 0f);
			countryAvgWeightLoss.put(countryId, newCountry);
		}
		String leaderBoard=printLeaderBoard();
		return leaderBoard;
		
	}
	public static String printLeaderBoard()
	{
		String leaderBoard="";
		Object [] countries = countryAvgWeightLoss.keySet().toArray();
		for(int x = 0; x<countries.length; x++)
		{
			leaderBoard = leaderBoard.concat(countries[x].toString()+": ");
			leaderBoard = leaderBoard.concat(String.format("%.1f", countryAvgWeightLoss.get(countries[x].toString()).getAvgWeightLoss())+", ");
		}
		leaderBoard = leaderBoard.substring(0, leaderBoard.length()-2);
		return leaderBoard;
	
	}

}
