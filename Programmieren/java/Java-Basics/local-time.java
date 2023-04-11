import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Programm2 {
  public static void main(String[] args) {
   LocalDate LocalDatejetzt = LocalDate.now();
    DateTimeFormatter meinFormat = DateTimeFormatter.ofPattern(
        "EEEE, d. MMMM yyyy");
    System.out.println("Heute ist " + meinFormat.format(LocalDatejetzt) + "!");
    System.out.println("Willkommen zu OOP" + "!");
  }
}
