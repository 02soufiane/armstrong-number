import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*Check if a number is armstrong number */


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int target=number;

        List<Integer> s = new ArrayList<>();

        int L=0;
        while (number > 0) {
            s.add(0, number % 10);
            number /= 10;
            L++;
        }
        int TEMP=0;
        for(Integer N:s){
            TEMP+=Math.pow(N,L);
        }

        if(TEMP==target){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}
