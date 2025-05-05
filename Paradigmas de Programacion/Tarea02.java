import javax.swing.JOptionPane;

public class Tarea02 {
    public static void main(String[] args) {
        double base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo."));
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo."));
        String tri="Triangulo";
        double area= calcularArea(tri, base, altura);
        JOptionPane.showMessageDialog(null, "Área del triangulo: "+area);
    }
}
