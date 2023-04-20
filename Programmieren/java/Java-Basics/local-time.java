import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Programm2 {
 public static void main(String[] args) {
  LocalDate jetzt = LocalDate.now();
  DateTimeFormatter meinFormat = DateTimeFormatter.ofPattern("EEEE, d. MMMM yyyy");
  System.out.println("Heute ist " + meinFormat.format(jetzt) + "!");
  System.out.println("Willkommen zu OOP" + "!");
 }
}
