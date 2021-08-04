import java.util.Scanner;

public class LitrosViagem{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        double tempoGasto;
        double velMedia;
        double distancia;
        double litrosViagem;
       
        System.out.println("Digite o tempo gasto na viagem: ");
        tempoGasto = teclado.nextDouble();

        System.out.println();
        System.out.println("Digite a velocidade media: ");
        velMedia = teclado.nextDouble();

        distancia = velMedia * tempoGasto;
        litrosViagem  = distancia/12;
        
        System.out.println();
        System.out.println("Nessa viagem foram gostos em litros: " + litrosViagem);
        


    }


}