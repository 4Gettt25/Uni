 public class Main {      
    public static void main(String[] args) {          
        String name = "World";          
        System.out.println("Hello, " + name);            
        
        int result = addNumbers(5, 7);         
         System.out.println("Das Ergebnis ist: " + result);      
        }        
   
         public static int addNumbers(int num1, int num2) {          
            int sum = num1 + num2;          
            return sum;     
         }  
    }  