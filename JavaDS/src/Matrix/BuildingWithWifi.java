package matrix;


import java.util.ArrayList;
import java.util.List;

public class BuildingWithWifi {


    //  Create router class for easy reference to location and range
    public static class Router {
        int location;
        int range;

        Router(int location, int range) {
            this.location = location;
            this.range = range;
        }
    }

    public int getServedBuildings(List<Integer> buildingCount, List<Integer> routerLocation, List<Integer> routerRange) {
        Integer[] buildingsServedArray = buildingCount.toArray(new Integer[0]);
        List<Router> routers = new ArrayList<>();
        int buildingsServed = 0;

        //  Loop and add location and range to routers list - (subtract 1 from location for 0 indexing)
        for(int i = 0 ; i < routerLocation.size() ; i++) {
            routers.add(new Router((routerLocation.get(i) - 1), routerRange.get(i)));
        }
        //  Loop over routers
        for(Router i : routers) {
            //  Check if router location minus range is in bounds (greater than or equal to 0) - set index
            int index = Math.max(i.location - i.range, 0);
            //  While index is in bounds and less than router location plus router range
            while(index < buildingsServedArray.length && index <= i.location + i.range) {
                //  Subtract 1 from each building in range
                buildingsServedArray[index] -= 1;
                //  Increment index
                index++;
            }
        }
        //  Loop buildings served array
        for(int i : buildingsServedArray) {
            if(i <= 0) {
                buildingsServed++;
            }
        }
        //  Return total buildings served
        return buildingsServed;
    }
    
    public static void main(String args[]) {
    	
    	List<Integer> bc = new ArrayList();
    	bc.add(2);
    	bc.add(1);
    	bc.add(1);
    	bc.add(3);
    	List<Integer> rl = new ArrayList();
    	List<Integer> rr = new ArrayList();
    			
    	rl.add(1);
    	rl.add(2);
    	
    	rr.add(2);
    	rr.add(0);
    	
    	
    	BuildingWithWifi b = new BuildingWithWifi();
    	b.getServedBuildings(bc, rl, rr);
    	
    	
    }

}