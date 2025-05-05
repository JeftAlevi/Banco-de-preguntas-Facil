import javax.swing.JOptionPane;

public class CalcularDobleNumero {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
        int doble= n*2;

        JOptionPane.showMessageDialog(null, "El doble es: "+ doble);
        
    }
    
}
