import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner (System.in);
        double numero, soma = 0.0;
        int qtdePositivos = 0;
        
        for(int cont=1; cont<=6; cont++){
            numero = teclado.nextDouble();
            if (numero > 0){
                qtdePositivos++; //não quero mostrar se o numero é positivo ou nao, eu quero contar qtos numeros positivos foram digitados
                soma = soma + numero;
            }
        }
        System.out.println(qtdePositivos + " valores positivos");
        System.out.printf("%.1f\n", (soma / qtdePositivos));
    }
}