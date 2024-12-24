package SlidingWindow.easy;

public class findingKBeautyOfNum {
    public static void main(String[] args) {
        int snum = 430043;
        String num = String.valueOf(snum);
        int k = 2;
        int len = num.length();
        int count = 0;
        for (int i = 0; i <= len - k; i++) {
            String s = num.substring(i, i + k);
            int div = Integer.parseInt(s);
            System.out.println(s);
            if (div > 0 && snum % div == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
