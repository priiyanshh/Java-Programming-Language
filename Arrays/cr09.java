// To Find Total Possibility Of SubArrays In An Array : 

import java.util.*;
public class cr09 {
    public static void printSubArray(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            int start =i;
            for(int j = i; j < numbers.length; j++){
                int end  = j;
                for(int k = start; k <= end; k++){ //print :
                    System.out.print(numbers[k] + " "); //Subarrays
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
