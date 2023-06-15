import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class home_work_3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
       
        for(int i = 0; i < 20; i++){
        list.add(new Random().nextInt(0, 10));
       
        }

        System.out.println(list);
        
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
        findMax(list);
        findMin(list);
        findAverage(list);
        removeEvenNumbers(list);
        }

        public static void findMax(ArrayList <Integer> list) {
            int max = list.get(0);
            for(int i : list){
                if (max < i){
                max = i;
                }
            }
            System.out.println("Максимальный элемент в списке - " + max);
        }

        public static void findMin(ArrayList <Integer> list) {
            int min = list.get(0);
            for(int i : list){
                if (min > i){
                    min = i;
                }
            }
            System.out.println("Миниальный элемент в списке - " + min);
        }

        public static void findAverage(ArrayList <Integer> list) {
            int sum = 0;
            for(int i : list){
                sum += i;
            }
            double result = sum / list.size();
            System.out.println("Среднее значение элементов в списке - " + result);
        }

        public static void removeEvenNumbers(ArrayList <Integer> list) {
            list.removeIf(i -> i % 2 == 0);
            System.out.println(list);
            }
            
        

        
}
