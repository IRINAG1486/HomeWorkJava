package home_work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class home_work_5 {
    public static void main(String[] args) {
        
        HashMap <String, ArrayList<String>> map = new HashMap<>();
        addElements(map, "Irina", "11111");
        addElements(map, "Irina", "22222");
        addElements(map, "Irina", "33333");
        addElements(map, "Andrey", "66666");
        addElements(map, "Andrey", "77777");
        addElements(map, "Elena", "88888");

        System.out.println(map);

        ArrayList <String> list = new ArrayList<>();
        for (String s: map.keySet()){
            list.add(s);
        }

        Collections.sort(list, new Comparator <String>(){
            @Override
            public int compare(String o1, String o2){
                return map.get(o1).size() - map.get(o2).size();
            }
        });

        System.out.println(list);

    }

    private static void addElements(HashMap<String, ArrayList<String>> map, String name, String phone){

        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
    }

    
    
}
