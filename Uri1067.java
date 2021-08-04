import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        int impares = 1;
              
        while(impares <= numero){        
        System.out.println(impares);
        impares = impares + 2;
        }
    }
}