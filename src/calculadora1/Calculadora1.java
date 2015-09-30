package calculadora1;

import javax.swing.JOptionPane;

public class Calculadora1 {

    public static void main(String[] args) {

        int a;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si quiere sumar"
                    + "\n" + "Digite 2 si quiere restar"
                    + "\n" + "Digite 3 si quiere multiplicar"
                    + "\n" + "Digite 4 si quiere dividir"
                    + "\n" + "Digite 5 si quiere Salir"));

            if (a == 1) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int suma = x + y;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);

            }
            if (a == 2) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int resta = x - y;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);

            }
            if (a == 3) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int multiplicacion = x * y;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);

            }
            if (a == 4) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int division = x / y;
                JOptionPane.showMessageDialog(null, "La division es: " + division);

            }

        } while (a < 5);
    }

}
