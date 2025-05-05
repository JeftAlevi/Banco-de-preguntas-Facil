/*  Escribe una función que calcule si un número dado es un número de Armstrong
*   (o también llamado narcisista).
*   Si no conoces qué es un número de Armstrong, debes buscar 
*/

import javax.swing.JOptionPane;

public class Practica07 {
    public static void main(String[] args) {
        //String num="153";
        String num=JOptionPane.showInputDialog("Ingrese un numero: ");
        int suma=0;
        for (int i = 0; i < num.length(); i++) {
            int dig=Integer.parseInt(String.valueOf(num.charAt(i)));
            suma=suma+(int)Math.pow(dig, 3);
        } 
        if (suma==Integer.parseInt(num)) {
            System.out.println("El número es de Armstrong");            
        }else{
            System.out.println("La suma es: "+suma);
        }
    }
}
