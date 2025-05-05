/*  Escribe una función que calcule y retorne el factorial de un número
*   dado de forma recursiva.
*   Factorial 0 -> 1
*   Factorial 1 -> 1
*   Factorial 7 -> 5040
*   Factorial 10 -> 3628800
*   Factorial < 0 -> No tiene factorial
*/
public class Practica06 {

    public static int factorial(int num){
        if (num<0) {
            return -1;
        }else if(num<1){
            return 1;
        }else{
            return factorial(num-1)*num;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(7));
        System.out.println(factorial(10));
        System.out.println(factorial(-5)==-1?"No tiene factorial":factorial(-5));
    }
}
