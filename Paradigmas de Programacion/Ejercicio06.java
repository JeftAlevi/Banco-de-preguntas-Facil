import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        int nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota."));

        if (nota<=10 && nota>=0) {
            JOptionPane.showMessageDialog(null, "Desaprobado.");
        } else if (nota<=14 && nota>=11) {
            JOptionPane.showMessageDialog(null, "Regular.");
        } else if (nota<=17 && nota>=15) {
            JOptionPane.showMessageDialog(null, "Bueno.");
        } else if (nota>=18 && nota<=20) {
            JOptionPane.showMessageDialog(null, "Excelente.");
        } else {
            JOptionPane.showMessageDialog(null, "NO VALIDO.");
        }
    }
}