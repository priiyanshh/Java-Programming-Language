// MAX SubArray Sum : ( By Brute Force Method ) :-
import java.util.*;
public class cr10 {
    public static void maxSubArraySum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int start =i;
            for(int j = i; j < numbers.length; j++){
                int end  = j;
                currentSum = 0;
                for(int k = start; k <= end; k++){ //print :
                // SubArray Sum :
                currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        maxSubArraySum(numbers);
    }
}