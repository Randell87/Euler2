import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> fc = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        fc.add(2);
        int l =0;
        int temp = 0;
        int sum = 0;
        while (temp<4000000){
            l = nums.size();
            temp = nums.get(l-1)+nums.get(l-2);
            nums.add(temp);
            if (temp%2 == 0) {
                fc.add(temp);
                System.out.println(temp);
            }
            //if (temp>4000000) break;

        }
        for (Integer i : fc){
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
