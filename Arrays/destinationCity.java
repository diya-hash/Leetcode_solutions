
//problem link: https://leetcode.com/problems/destination-city/description/
import java.util.*;

public class destinationCity {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paths = new ArrayList<ArrayList<String>>();
        // paths.get(0).add(0, "London");


        ArrayList<String> pathA = new ArrayList<>();
        ArrayList<String> pathB = new ArrayList<>();

        String result = "";

        for (int i = 0; i < paths.size(); i++) {
            pathA.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            pathB.add(paths.get(i).get(1));
        }
        for(int i=0; i<paths.size(); i++){
            if(pathA.contains(pathB.get(i)) == false) result = pathB.get(i)
        }
        System.out.println(pathA);
    }
}