import javax.swing.JOptionPane;

public class Practica02 {

    public static double areaPoligono(String poligono){
        double area=0;
        int base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese base."));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura."));
        if (poligono.equals("triangulo")) {
            area=(base*altura)/2;
        }else if (poligono.equals("rectangulo")) {
            area=(base*altura);
        }
        return area;
    }
    public static void main(String[] args) {
        double areat=areaPoligono("triangulo");
        System.out.println("El area del triangulo es: "+areat);
        double arear=areaPoligono("rectangulo");
        System.out.println("El area del rectangulo es: "+arear);
    }
}
