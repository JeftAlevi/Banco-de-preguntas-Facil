import javax.swing.JOptionPane;;

public class AreaCirculo {
    public static void main(String[] args) {
        double x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio del círculo: "));
        double y=Math.PI * Math.pow(x, 2);

        JOptionPane.showMessageDialog(null, "El área de círculo es: "+y);
    }
}
1