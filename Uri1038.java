import java.util.Scanner;

public class Uri1038{

    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int codigo, qtde;
        double Total;

        codigo = teclado.nextInt();
        qtde = teclado.nextInt();

        if(codigo == 1){
            Total = qtde * 4.00;
            System.out.printf("Total: R$ %.2f\n", Total);            
        }
        else{
            if(codigo == 2){
                Total = qtde * 4.50;
                System.out.printf("Total: R$ %.2f\n", Total);
            }
            else{
                if(codigo == 3){
                Total = qtde * 5.00;
                System.out.printf("Total: R$ %.2f\n", Total);
                }
                else{
                    if(codigo == 4){
                    Total = qtde * 2.00;
                    System.out.printf("Total: R$ %.2f\n", Total);
                    }
                    else{
                        if(codigo == 5){
                        Total = qtde * 1.50;
                        System.out.printf("Total: R$ %.2f\n", Total);
                        }
                    }
                }
            }
        }

    }
}