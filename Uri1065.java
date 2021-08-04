import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        int qtdePares = 0;
        
        for(int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero %2 == 0 ){
                qtdePares++; //não quero mostrar se o numero é positivo ou nao, eu quero contar qtos numeros positivos foram digitados
            }
        }
        System.out.println(qtdePares + " valores pares");
        
    }
}