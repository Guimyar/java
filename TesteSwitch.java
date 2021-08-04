import java.util.Scanner;
public class TesteSwitch{
    public statusc void main (String args[]){

        Scanner tevlado = new Scanner (System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        switch (numero){ //aceita inteiros, string e char(1 unico caracter)
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Digitou outro valor");
        }

    }
}