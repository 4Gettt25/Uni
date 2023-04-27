import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Transferaufgabe2 extends JFrame {

  public Transferaufgabe2() {
    setTitle("Transferaufgabe2 Tabelle");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    String[][] data = new String[6][4];

    data[0][0] = "int a, b;";

    data[1][0] = "a=1234;"; // Wert 1234 in der zweiten Zeile von Spalte 2 einfügen

    data[2][0] = "b=99;"; // Wert 99 in der dritten Zeile von Spalte 3 einfügen

    data[3][0] = "int t=a;"; // Formel "=a" in der vierten Zeile von Spalte 4 einfügen

    data[4][0] = "a=b;"; // Formel "=b" in der fünften Zeile von Spalte 2 einfügen

    data[5][0] = "b=t;"; // Formel "=t" in der sechsten Zeile von Spalte 3 einfügen

    // einträge für int a, b;
    data[0][1] = "null";

    data[0][2] = "null";

    data[0][3] = "null";

    // einträge für a=1234
    data[1][1] = "1234";

    data[1][2] = "null";

    data[1][3] = "null";

    // einträge für b=99
    data[2][1] = "1234";

    data[2][2] = "99";

    data[2][3] = "null";

    // einträge für int t=a
    data[3][1] = "1234";

    data[3][2] = "99";

    data[3][3] = "1234";

    // einträge für a=b
    data[4][1] = "99";

    data[4][2] = "99";

    data[4][3] = "1234";

    // einträge für b=t
    data[5][1] = "99";

    data[5][2] = "1234";

    data[5][3] = "1234";

    String[] columnNames = { " ", "a", "b", "t" };

    JTable table = new JTable(data, columnNames);
    JScrollPane scrollPane = new JScrollPane(table);
    add(scrollPane);

 pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    new Transferaufgabe2();
  }
}
