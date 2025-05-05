import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota: "));

        if (n1>= 18) {
            JOptionPane.showMessageDialog(null, "Excelente");
        } else if (n1>= 15) {
            JOptionPane.showMessageDialog(null, "Bueno");
        } else if (n1>= 11) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
    }
}
