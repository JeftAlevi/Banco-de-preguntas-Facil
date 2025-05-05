import javax.swing.JOptionPane;

public class Tarea01 {
    public static void main(String[] args) {
        String resultado="";

        for (int i = 1; i <=15; i++) {
            if (i %3==0 && i %5==0) {
                resultado +="fizzbuzz\n";
            } else if (i %3==0) {
                resultado +="fizz\n";
            } else if (i %5==0) {
                resultado +="buzz\n";
            } else {
                resultado += i+ "\n";
            }
        }
        System.out.println(resultado);
    }
}
