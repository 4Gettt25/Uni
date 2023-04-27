import java.util.Scanner;
class MaxOfThree{
public static void main(String[] args)
{Scanner scanner = new Scanner(System.in);
System.out.print("Geben Sie die erste Zahl ein (a): ");
int a = scanner.nextInt();
System.out.print("Geben Sie die zweite Zahl ein (b): ");
int b = scanner.nextInt();
System.out.print("Geben Sie die dritte Zahl ein (c): ");
int c = scanner.nextInt();
int max;
if
(a > b){            
max = a;
}
else
{           
max = b;
}
if
(c > max){            
max = c;
}
System.out.println("Die größte der drei Zahlen ist: "+ max);
}
}

