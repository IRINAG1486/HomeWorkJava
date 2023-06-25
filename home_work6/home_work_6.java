package home_work6;

import java.util.HashMap;
import java.util.Iterator;

public class home_work_6 {
    public static void main(String[] args) {
        SetImitation <Integer> setImitation = new SetImitation<>();
        
        System.out.println("Элемент добавлен: " + setImitation.add(11));
        System.out.println("Элемент добавлен: " + setImitation.add(2));
        System.out.println("Элемент добавлен: " + setImitation.add(12));
        System.out.println("Элемент добавлен: " + setImitation.add(11));

        System.out.println(setImitation.toString());

        System.out.println("Элемент удален: " + setImitation.remove(11));
        System.out.println("Элемент удален: " + setImitation.remove(11));
        
        System.out.println(setImitation.toString());

        System.out.println("Количество элементов: " + setImitation.size());
        
        System.out.println("Коллекция пуста: " + setImitation.isEmpty());

        System.out.println("Коллекция содержит значение: " + setImitation.contains(12));
        System.out.println("Коллекция содержит значение: " + setImitation.contains(11));

        Iterator <Integer> iterator = setImitation.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Значение элемента по индексу: " + setImitation.getIndexElement(0));

    }
    
}


class SetImitation <E> {   //класс, который будет иммитировать работу Set

    private HashMap <E, Object> map = new HashMap<>(); //используем HashMap как внутреннюю структуру хранения данных

    private static final Object OBJECT = new Object(); // используем в качестве константного значения - класс Object

    @Override
    public String toString() {
       return map.keySet().toString(); //метод, возвращающий строку из значений
       
    }

    public boolean add(E number){
        return map.put(number, OBJECT) == null; // метод добавит значение, если такого значения не было

    }


    public boolean remove(E number){
        return map.remove(number, OBJECT); //метод, который удаляет необходимое значение
    }

    public int size(){
        return map.size(); // метод, который возвращает количество элементов
    }

    public boolean isEmpty(){
        return map.isEmpty(); // метод, проверяющий пустая ли коллекция
    }
   
    public boolean contains(Object number){
        return map.containsKey(number); //метод, проверяющий, содержится ли значение в коллекции

    }

    public Iterator <E> iterator(){
        return map.keySet().iterator(); // метод, позволяющий получить данные из коллекции
    }

    public E getIndexElement(int index){           // метод, позволяющий получить элемент по индексу
        E[] array = (E[]) map.keySet().toArray();  
        return array[index]; 
        
    }

}
