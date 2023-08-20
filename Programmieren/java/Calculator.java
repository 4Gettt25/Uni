import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Rechenoperation wollen Sie durchführen? ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        int operation = scanner.nextInt();

        System.out.print("Gib die erste Zahl ein: ");
        double number1 = scanner.nextDouble();

        System.out.print("Gib die zweite Zahl ein: ");
        double number2 = scanner.nextDouble();

        double number3 = 0;

        // Eingabe der dritten Zahl, wenn die Operation Addition, Subtraktion oder Multiplikation ist
        if (operation >= 1 && operation <= 4) {
            System.out.print("Gib die dritte Zahl ein (leer lassen, wenn nicht benötigt): ");
            scanner.nextLine(); // Verbrauche den Zeilenumbruch
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                number3 = Double.parseDouble(input);
            }
        }

        scanner.close();

        double result = 0;
        String operationName = "";

        switch (operation) {
            case 1:
                result = number1 + number2 + number3;
                operationName = "Addition";
                break;
            case 2:
                result = number1 - number2 - number3;
                operationName = "Subtraktion";
                break;
            case 3:
                result = number1 * number2 * number3;
                operationName = "Multiplikation";
                break;
            case 4:
                if (number2 == 0 || number3 == 0) {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    return; // Programm beenden
                }
                result = number1 / number2 / number3;
                operationName = "Division";
                break;
            default:
                // Handle invalid input
                System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Zahl zwischen 1 und 4.");
                return; // Programm beenden
        }

        // Ausgabe auf zwei Dezimalstellen gerundet
        System.out.printf("%s von %.2f, %.2f und %.2f ist: %.2f%n", operationName, number1, number2, number3, result);
    }
}