import java.util.*;

class sortPeople {
    public String[] sortPeople(String[] name, int[] heights) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < heights.length; i++)
            list.add(heights[i]);

        for (int i = 0; i < heights.length; i++)
            map.put(Integer.valueOf(heights[i]), name[i]);

        Collections.sort(list);
        Collections.reverse(list);
        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = map.get(list.get(i));
            name[i] = s;
            // System.out.println(name[i]);
        }
        return name;
    }
}