package Matrix;
import java.util.*;

public class BadgeTime {
	public static void main(String[] args) {

		String[][] badgeTimes = new String[][] { { "Paul", "1355" }, { "Jennifer", "1910" }, { "Jose", "835" },
			{ "Jose", "830" }, { "Paul", "1315" }, { "Chloe", "0" }, { "Chloe", "1910" }, { "Jose", "1615" },
			{ "Jose", "1640" }, { "Paul", "1405" }, { "Jose", "855" }, { "Jose", "930" }, { "Jose", "915" },
			{ "Jose", "730" }, { "Jose", "940" }, { "Jennifer", "1335" }, { "Jennifer", "730" }, { "Jose", "1630" },
			{ "Jennifer", "5" }, { "Chloe", "1909" }, { "Zhang", "1" }, { "Zhang", "10" }, { "Zhang", "109" },
			{ "Zhang", "110" }, { "Amos", "1" }, { "Amos", "2" }, { "Amos", "400" }, { "Amos", "500" },
			{ "Amos", "503" }, { "Amos", "504" }, { "Amos", "601" }, { "Amos", "602" }, { "Paul", "1416" }, };


			Map<String, TreeSet<Integer>> map = new HashMap<String, TreeSet<Integer>>();
			for(int i=0;i<badgeTimes.length;i++)
			{
				int temp = convertTimeToInt(badgeTimes[i][1]);
				if(map.containsKey(badgeTimes[i][0]))
				{
					
					TreeSet<Integer> tree = new TreeSet<Integer>();
					tree = map.get(badgeTimes[i][0]);
					tree.add(temp);
					map.put(badgeTimes[i][0], tree);
				}
				else
				{
					TreeSet<Integer> tree = new TreeSet<Integer>();
					tree.add(temp);
					map.put(badgeTimes[i][0], tree);
				}
			}
			for(Map.Entry<String, TreeSet<Integer>> entry : map.entrySet())
			{
				Object[] arr = entry.getValue().toArray();
				for(int i=1;i<arr.length-1;)
				{
					if((int)arr[i+1] - (int)arr[i-1] <= 60)
					{
						System.out.println(entry.getKey() + "::" +(int)arr[i-1]+"::"+ (int)arr[i]+"::" +(int)arr[i+1]);
						i=i+3;
					}
					else
						i++;
				}
			}

	}

	private static int convertTimeToInt(String string) {
		if(string.length()==1 || string.length()==2)
			return Integer.parseInt(string);
		else if(string.length()==3)
		{
			return ((string.charAt(0)-'0')*60)+ Integer.parseInt(string.substring(1,string.length())) ;
		}
		else
		{
			return (Integer.parseInt(string.substring(0,2))*60)+ Integer.parseInt(string.substring(2,string.length())) ;
		}
	}
}
