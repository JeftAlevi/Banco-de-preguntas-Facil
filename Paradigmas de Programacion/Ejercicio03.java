import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Selecciones una operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División"));

        double num1= Double.parseDouble(JOptionPane.showInputDialog("Primer número: "));
        double num2= Double.parseDouble(JOptionPane.showInputDialog("Segundo número: "));
        double resultado;

        if (opcion == 1) {
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
        } else if (opcion == 2) {
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
        } else if (opcion == 3) {
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
        } else if (opcion == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}