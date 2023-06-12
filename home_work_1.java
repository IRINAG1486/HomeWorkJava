import java.util.Random;


public class home_work_1 {
    public static void main(String[] args) {
        
        int i = new Random().nextInt(0, 2000);
        System.out.println("Случайное целое число в диапазоне от 0 до 2000: " + i);


        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значащего бита выпавшего числа: " + n);


       
        int[] m1 = new int[findCountForMaxValue(n, i) + 1];
        
        for(int j = i; j <= Short.MAX_VALUE; j++){
            if(j % n == 0){
                for (int index = 0; index < m1.length; index++){
                m1[index] = j;
                //System.out.print(m1[index] + " ");
                }
            
                  
             }
        
             }
       
        int[] m2 = new int[findCountForMinValue(n, i) + 1];
        
        for(int j = Short.MIN_VALUE; j <= i; j++){
            if(j % n != 0){
                for (int index = 0; index < m2.length; index++){
                m2[index] = j;
                //System.out.print(m2[index] + " ");
                }
            
                  
             }
        
             }
        
         }

    public static int findCountForMaxValue(int number, int min) {
        int count = 0;    
        for(int j = min; j <= Short.MAX_VALUE; j++){
            
            if(j % number == 0){
                count += 1;
            }
        }
        System.out.println("Количество кратных n числа в диапазоне от i до Short.MAX_VALUE: " + count);
        return count;
    }

    public static int findCountForMinValue(int number, int min) {
        int count = 0;    
        for(int j = Short.MIN_VALUE; j <= min; j++){
            
            if(j % number != 0){
                count += 1;
            }
        }
        System.out.println("Количество некратных n числа в диапазоне от Short.MIN_VALUE до i: " + count);
        return count;
    }
    
    
}