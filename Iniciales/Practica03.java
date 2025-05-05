public class Practica03 {

    public static String textoInvertido(String texto){
        String invertido="";
        for (int i = texto.length()-1; i >= 0; i--) {
            invertido+=texto.charAt(i);
        }
        return invertido;
    }
    public static void main(String[] args) {
        String texto="Hola mundo";
        String invertido=textoInvertido(texto);
        System.out.println(texto);
        System.out.println(invertido);
    }
}
