import java.util.Scanner;

public class Uri1008{

    public static void main(String args[]){

        Scanner teclado = new Scanner (System.in);

        int numFunc;
        int hrTrab;
        double custoHr;
        double salario;

        numFunc = teclado.nextInt();
        hrTrab = teclado.nextInt();
        custoHr = teclado.nextDouble();

        salario = hrTrab * custoHr;

        System.out.println("NUMBER = %d\n", numFunc);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}