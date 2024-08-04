//Linear Search :

import java.util.*;
public class ArraysCC04 {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i; // Corrected return statement
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 10; // Corrected key declaration

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
}
