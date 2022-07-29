package matrix;

import java.util.HashMap;
import java.util.PriorityQueue;

public class VotingSystem {
	
	public String rankTeams(String[] votes) {
        
	       int teamSize=votes[0].length();
	        
	        HashMap<Character,int[]> rankMap = new HashMap();
	        for(int i=0;i<votes.length;i++){
	            for(int j=0;j<votes[i].length();j++){
	               char team= votes[i].charAt(j);
	               if(!rankMap.containsKey(team))
	                   rankMap.put(team,new int[teamSize]);
	               rankMap.get(team)[j]++; 
	            }
	        }
	        	
	        // System.out.println(rankMap);
	        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b)->{
	            for(int i=0;i<teamSize;i++){
	                if(rankMap.get(a)[i]!= rankMap.get(b)[i]){
	                	//System.out.println(" b " + rankMap.get(b)[i]);
	                	//System.out.println(" a "+ rankMap.get(a)[i]);
	                	System.out.println(rankMap.get(b)[i]-rankMap.get(a)[i]);
	                    return rankMap.get(b)[i]-rankMap.get(a)[i];
	                }
	            }
	            return a-b;
	        });
	        for(Character c:rankMap.keySet())
	            pq.add(c);
	        
	        StringBuilder finalRank=new StringBuilder("");
	        
	        while(pq.size()>0)
	           finalRank.append(pq.poll());
	            
	        
	         return finalRank.toString();
	    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] votes = new String[]{"ABC","ACB","ABC","ACB","ACB"};
		
		VotingSystem v = new VotingSystem();
		String result = v.rankTeams(votes);
		System.out.println(result);

	}

}
