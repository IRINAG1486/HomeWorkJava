package home_work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class home_work_5_1 {
    public static void main(String[] args) {
        
        HashMap <String, String> map = new HashMap<>();

        map.merge("Irina", "11111", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Irina", "22222", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Irina", "33333", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Elena", "44444", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Elena", "55555", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Irina", "66666", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Andrey", "11111", (o, n) -> o == null ? n : o + " " + n);


        System.out.println(map);

        ArrayList <String> list = new ArrayList<>();
        for(String s : map.keySet()){
            list.add(s);
        }

        // Collections.sort(list, new Comparator<>() {
        //     public int compare(String o1, String o2){
        //         return map.get(o1).split(" ").length - map.get(o2).split(" ").length;
        //     }
        // });

        Collections.sort(list, (o1, o2) -> map.get(o1).split(" ").length - map.get(o2).split(" ").length);

        System.out.println(list);
    }
    
}
