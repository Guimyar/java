import java.util.Scanner;

public class AreaQuadrado{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double valorDouble;
        double area;
        

        System.out.println("Digite o valor do lado do quadrado: ");
        valorDouble = teclado.nextDouble();

        area = valorDouble * valorDouble;

        System.out.println();
        
        System.out.println("Area do quadrado = " + area);

}

}