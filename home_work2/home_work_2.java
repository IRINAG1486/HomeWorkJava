package home_work2;

public class home_work_2 {
    public static void main(String[] args) {

        // Задание 1.
        String line1 = "select * from students where ";
        String line2 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        changeLine(line1, line2);

        // Задание 2.
        String string = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"} ]";
        changeString(string);


            // Задание 3. 
            /**
            String string01 = " ";
            StringBuilder string02 = new StringBuilder();

            for (int i = 0; i < 100000; i++){
                string01 += "a";
                string02.append("a");
            }
            
            long start = System.currentTimeMillis();
            string01.replace("a", "A");
            System.out.println("String result: " + (System.currentTimeMillis() - start));
            
            start = System.currentTimeMillis();
            string02.replace(0, string02.length(), "A");
            System.out.println("StringBuilder result: " + (System.currentTimeMillis() - start));
            */
        }

        public static void changeString(String str){
            String str1 = str.replace("[", "").replace("]", "").replace("{", "").replace(":", " ").replace("\"", "").replace(",", " ").replace("\\s", "");
            //System.out.println(str1);
            StringBuilder builder = new StringBuilder();
            String [] array = str1.split("} ");
            String [] titls = {"Студент ", " получил ", " по предмету "};
            for(int i = 0; i < array.length; i++){
                //System.out.println(array[i]);
                String [] array2 = array[i].split(" ");
                
                builder.append(titls[0]);
                builder.append(array2[1]);
                builder.append(titls[1]);
                builder.append(array2[3]);
                builder.append(titls[2]);
                builder.append(array2[5] + "\n");
                    
                
            }
        
            System.out.println(builder);

        }

        public static void changeLine(String line1, String line2){
            StringBuilder builder = new StringBuilder(line1);
            String line3 = line2.replace("{", "").replace("}", "").replace("\"", "");
        
            //System.out.println(line3);
            String [] array = line3.split(",");
            for(int i = 0; i < array.length; i++ ){
                String [] array2 = array[i].split(":");
                if(array2[1].equals("null") == false  ) { 
                    if (i == 0){
                        builder.append(array2[0]);
                        builder.append(" = ");
                        builder.append(array2[1]);    
                    }
                    else {
                        builder.append(", ");
                        builder.append(array2[0]);
                        builder.append(" = ");
                        builder.append(array2[1]);
                    }
                }
           
           
            }
            
        System.out.println(builder);   
    }
}