import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        int par=0;
        int impar=0;
        int qtdePositivos = 0;
        int qtdeNegativos = 0;
        
        for(int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero > 0){
                qtdePositivos++; //não quero mostrar se o numero é positivo ou nao, eu quero contar qtos numeros positivos foram digitados
                
            } else if(numero < 0){
                qtdeNegativos++;
            }

            if (numero %2 == 0){ //sei que um numero é par quando o resto da divi~sao for zero
                par++;
            }else if (numero %2 != 0){
                impar++;  
            }
        }
        System.out.println(par + " valor (es) par (es)");
        System.out.println(impar + " valor (es) impar (es)");
        System.out.println(qtdePositivos + " valor (es) positivo (s)");
        System.out.println(qtdeNegativos + " valor (es) negativo (s)");
    }
}