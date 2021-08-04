import java.util.Scanner;

public class AreaTriangulo{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        double base;
        double altura;
        double area;

        System.out.println("Digite o valor da base do triangulo: ");
        base = teclado.nextDouble();

        System.out.println();
        System.out.println("Digite o valor da altura do triangulo: ");
        altura = teclado.nextDouble();

        area = (base*altura)/2;

        System.out.println();
        System.out.println("O valor da base e: " + area);
       


    }


}