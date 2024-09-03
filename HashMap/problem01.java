import java.util.*;
public class problem01{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Put :
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Bhutan", 520);
        System.out.println(hm);

        //Get :
        int population = hm.get("India");
        System.out.println(population);

        //Contains Key :
        System.out.println(hm.containsKey("India")); //True
        System.out.println(hm.containsKey("US")); //False

        //Remove :
        System.out.println(hm.remove("Bhutan"));

        //Size :
        System.out.println(hm.size());

        //IsEmpty :
        System.out.println(hm.isEmpty());

        //Clear : will clear all the data of hashmap,
        hm.clear();
    }
}