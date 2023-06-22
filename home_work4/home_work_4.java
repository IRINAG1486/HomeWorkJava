package home_work4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class home_work_4 {
    
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    
        ArrayList<String> surnames = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> last_names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();
        
        while (true){
            
            iScanner = new Scanner(System.in);
            System.out.println("Введите фамилию, имя и отчество или 0 для завершения ввода : ");
            String name = iScanner.nextLine();
            if (name.equals("0")) {
                break;
            }
            iScanner = new Scanner(System.in);
            System.out.println("Введите возраст или 000 для завершения ввода: ");
            Integer age = iScanner.nextInt();
            if (age.equals(000)){
                break;
            }
            iScanner = new Scanner(System.in);
            System.out.println("Введите пол(w - для женщин, m - для мужчин) или 0 для завершения ввода: "); 
            String gender = iScanner.nextLine();
            if (gender.equals("0")){
                break;
            }
            
            
            String [] firstParametr = name.split(" ");
            surnames.add(firstParametr[0]);
            names.add(firstParametr[1]);
            last_names.add(firstParametr[2]);
            ages.add(age);
            genders.add(gender);
            
            
            System.out.println("Список фамилий: " + surnames);
            System.out.println("Список имен: " + names);
            System.out.println("Список отчеств: " + last_names);
            System.out.println("Список возростов: " + ages);
            System.out.println("Список полов: " + genders);

            
        }
            
           
            ArrayList <Integer> id = createId();
            id.forEach(n -> System.out.println(surnames.get(n).toUpperCase()+ " " + names.get(n).toUpperCase().charAt(0)+ "." + " " + last_names.get(n).toUpperCase().charAt(0)+ "." + " " + ages.get(n)+ " " + genders.get(n)));

            Collections.sort(id, (o1, o2) -> ages.get(o1) - ages.get(o2));
            System.out.println("Сортировка индексов в порядке возрастания возростов: " + id);
            id.forEach(n -> System.out.println("Сортировка в порядке возрастания возростов: " + surnames.get(n)+ " " + names.get(n) + " " + last_names.get(n)+ " " + ages.get(n)));
            
            ArrayList <Integer> id_gender_sort = sortGenders(id,genders);
            System.out.println("Сортировка индексов согласно пола: " + id_gender_sort);
            
        }

        public static ArrayList <Integer> createId(){
            ArrayList <Integer> id = new ArrayList<>();
            for (int i = 0; i < 3; i++){
            id.add(i);
            
            }
            
            return id;
        }
       
        public static ArrayList <Integer> sortGenders(ArrayList <Integer> id, ArrayList<String> line1){
            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            
            for(int i : id){
                if (line1.get(i).equals("m")){
                    tmp1.add(i);
               
                }
                else{
                    tmp2.add(i);
                }      
            }
            //System.out.println(tmp1);
            //System.out.println(tmp2);
            tmp1.addAll(tmp2);

            return tmp1;
           
        }
    }