import java.util.Scanner;

public class AreaTrapezio{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double baseMaior;
        double baseMenor;
        double altura;
        double area;

        System.out.println("Digite o valor da base maior: ");
        baseMaior = teclado.nextDouble();

        System.out.println();
        System.out.println("Digite o valor da base menor: ");
        baseMenor = teclado.nextDouble();

        System.out.println();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        area = (baseMaior + baseMenor) * altura/2;

        System.out.println();
        System.out.println("O valor da base e: " + area);

    }
}