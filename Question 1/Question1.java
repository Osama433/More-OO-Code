import java.util.ArrayList;
import java.util.List;

public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String file= "1620,400,800,600\n1620,500,300,400\n1320,200,200,300";
		streakCounter(file);
	}
	public static int streakCounter(String file) {
		// TODO Auto-generated method stub
		int maxStreak=0;
		int temp=0;
		List<ArrayList<Integer>> calories = readFile(file);
		for (int x=0; x<(calories.size()); x++)
		{
			ArrayList<Integer> current = calories.get(x);

			if(current.get(0)<(current.get(1)+current.get(2)+current.get(3)))
			{
				temp=0;
			}
			else
			{
				temp++;
				if(temp>maxStreak)
				{
					maxStreak = temp;
				}
			}
		}
		return maxStreak;

	}

	private static List<ArrayList<Integer>> readFile(String input) { 
		List<ArrayList<Integer>> allLines = new ArrayList<ArrayList<Integer>>();

		String [] linesArray = input.split("\n"); 
		String [] singleArray;
		for (String x : linesArray)
		{ 
			ArrayList<Integer> singleLine= new ArrayList<Integer>();
			singleArray = x.split(",");
			for(int a = 0; a<=3; a++ )
			{ 
				singleLine.add( Integer.parseInt(singleArray[a])); 
			} 
			allLines.add(singleLine); 
		} 
		return allLines; 
	}


}