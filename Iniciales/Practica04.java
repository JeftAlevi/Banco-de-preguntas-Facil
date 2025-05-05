/* Crea un programa se encargue de transformar un número  
    decimal a binario sin utilizar funciones propias del lenguaje 
    que lo hagan directamente.
    decimal = 29; //Número decimal a convertir; RPTA: 11101
*/
public class Practica04 {
    public static void convertirBinario(int decimal){
        String binario="";
        while (decimal>0) {
            int resto=decimal%2;
            decimal=decimal/2;
            binario=resto+binario;
        }
        System.out.print(binario);
    }
    public static void main(String[] args) {
        convertirBinario(29);
    }
}
