import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingre el número: "));

        if (n1 %2 == 0) {
            JOptionPane.showMessageDialog(null, "El número "+n1+" es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+n1+" es impar.");
        }
    }
}