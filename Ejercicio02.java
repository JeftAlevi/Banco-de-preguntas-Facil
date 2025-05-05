import javax.swing.JOptionPane;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        if (n1>n2) {
            JOptionPane.showMessageDialog(null, "El mayor es: "+n1);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es: "+n2);
        }
    }
}
