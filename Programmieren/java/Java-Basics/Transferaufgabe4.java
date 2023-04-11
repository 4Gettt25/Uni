import java.util.Scanner;

class Temperaturumrechnung {
  public static void main(String[] args) {
    // Benutzer zur Eingabe der Temperatur in Grad Celsius auffordern
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie die Temperatur in Grad Celsius ein: ");
    double celsius = scanner.nextDouble();

    // Temperatur in Grad Fahrenheit und Kelvin umrechnen
    double fahrenheit = (celsius * 9 / 5) + 32;
    double kelvin = celsius + 273.15;

    // Ergebnisse ausgeben
    System.out.println(celsius + " Grad Celsius entspricht " + fahrenheit + " Grad Fahrenheit.");
    System.out.println(celsius + " Grad Celsius entspricht " + kelvin + " Kelvin.");
    // Scanner schließen
    scanner.close();
  }
}
