import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número."));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número."));
        
        if (x % y==0) {
            JOptionPane.showMessageDialog(null, x+" si es multiplo de "+y+".");
        } else {
            JOptionPane.showMessageDialog(null, "NO ES MULTIPLO");
        }
    }
}
