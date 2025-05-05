 import java.util.stream.Gatherer.Integrator;

import javax.swing.JOptionPane;

 public class Ejercicio04 {
    public static void main(String[] args) {
        int anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año:"));

        if ((anio % 4==0 && anio %100 !=0)||(anio %400 == 0)) {
            JOptionPane.showMessageDialog(null, anio+" es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, anio+" no es un año bisiesto.");
        }
    }
 }