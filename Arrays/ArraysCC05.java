// Largest Number in the given Array :
import java.util.*;
public class ArraysCC05 {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // -Infinity:
        int smallest = Integer.MAX_VALUE; // +Infinity:

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]  = {1, 2, 4, 6, 8, 10};
        System.out.println("largest value is : " + getLargest(numbers));
    }
}
