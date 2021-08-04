import java.util.Scanner;

public class KwGasto{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        double salMin;
        double kwGasto;
        double cadaKw;
        double reaisPago;
        double valorComDesc;

        System.out.println("Digite o salario minimo: ");
        salMin = teclado.nextDouble();

        System.out.println();
        System.out.println("Digite a quantidade de Kw gasta: ");
        kwGasto = teclado.nextDouble();

        cadaKw = (salMin/7)/100;
        reaisPago  = kwGasto * cadaKw;
        valorComDesc = reaisPago * 0.9;

        System.out.println();
        System.out.println("O valor de cada KW e: " + cadaKw);
        System.out.println("O valor a ser pago e: " + reaisPago);
        System.out.println("O valor a ser pago com desc 10%: " + valorComDesc);


    }


}