// Arrays as a Arguement : 

import java.util.*;
public class ArraysCC03 {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 95, 86};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        //print our marks :
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}