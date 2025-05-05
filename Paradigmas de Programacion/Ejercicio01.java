import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado A"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado B"));
        int z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado C"));

        if (x+y>z && x+z>y && y+z>x) {
            if (x==y && x==z) {
                JOptionPane.showMessageDialog(null, "Triangulo equilátero.");
            } else if (x==y || x==z || y==z) {
                JOptionPane.showMessageDialog(null, "Triangulo isóseles.");
            } else {
                JOptionPane.showMessageDialog(null, "Triangulo escaleno.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No es triangulo.");
        }
        
    }
}