import java.util.Scanner;

class Grundrechenarten {
  public static void main(String[] args) {
    // Benutzer zur Eingabe von zwei Zahlen auffordern
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie die erste Zahl ein: ");
    double zahl1 = scanner.nextDouble();
    System.out.print("Bitte geben Sie die zweite Zahl ein: ");
    double zahl2 = scanner.nextDouble();

    // Ergebnisse der vier Grundrechenarten berechnen
    double summe = zahl1 + zahl2;
    double differenz = zahl1 - zahl2;
    double produkt = zahl1 * zahl2;
    double quotient = zahl1 / zahl2;

    // Ergebnisse ausgeben
    System.out.println("Summe: " + summe);
    System.out.println("Differenz: " + differenz);
    System.out.println("Produkt: " + produkt);
    System.out.println("Quotient: " + quotient);

    // Scanner schließen
    scanner.close();
  }
}
