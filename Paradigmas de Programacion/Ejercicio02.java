import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog("a: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("b: "));
        double c=Double.parseDouble(JOptionPane.showInputDialog("c: "));
        double resol= Math.pow(b, 2) - 4 * a * c;

        if (a==0) {
            JOptionPane.showMessageDialog(null, "No es una ecuación.");
        } else if (resol > 0) {
            double x1=(-b + Math.sqrt(resol)) / (2*a);
            double x2=(-b - Math.sqrt(resol)) / (2*a);
            JOptionPane.showMessageDialog(null, "Dos soluciones reales: x1 = "+x1+", x2 = "+x2);
        } else if (resol == 0) {
            double x= -b / (2*a);
            JOptionPane.showMessageDialog(null, "Una solución real: x = "+x);
        } else {
            JOptionPane.showMessageDialog(null, "No tiene solución reales.");
        }
    }
}