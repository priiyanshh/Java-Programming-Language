import java.util.*;
public class problem02{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Put :
        hm.put("India", 100);
        hm.put("China", 145);
        hm.put("Bhutan", 150);
        hm.put("USA", 245);
        hm.put("America", 365);
        hm.put("Africa", 215);
        System.out.println(hm);

        //Iterate :
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+ ",value="+hm.get(k));
        }
    }
}