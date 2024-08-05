import java.util.*;
public class cr07 {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers [last] = numbers[first];
            numbers [first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {9, 7, 3, 1, 4, 5, 8, 9, 3, 7};
        reverse (numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}
