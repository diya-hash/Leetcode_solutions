import java.util.ArrayList;
import java.util.List;

public class findInstancesOfStableMountains {
    public static void main(String[] args) {
        int height[] = { 10, 1, 10, 1, 10 };
        int threshold = 10;
        List<Integer> list = new ArrayList<>();
        int j = 0;

        for (int i = 0; i < height.length; i++) {
            if (i > 0 && height[i - 1] > threshold) {
                list.add(i);
                j++;
            }
        }
        System.out.println(list);
    }
}
