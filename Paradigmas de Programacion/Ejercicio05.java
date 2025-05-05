import javax.swing.JOptionPane;

public class Ejercicio05 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número."));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número."));
        int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer número."));

        if (a>b && a>c) {
            JOptionPane.showMessageDialog(null,a+" es mayor.");
        } else if (b>a && b>c) {
            JOptionPane.showMessageDialog(null,b+" es mayor.");
        } else if (c>a && c>b) {
            JOptionPane.showMessageDialog(null,c+" es mayor.");
        } else {
            JOptionPane.showMessageDialog(null, "Hay dos o mas números iguales o máximos.");
        }
    }
}