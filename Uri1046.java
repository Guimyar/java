import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){

        Scanner teclado = new Scanner (System.in);

        int inicio, fim, tempo;
        inicio = teclado.nextInt();
        fim = teclado.nextInt();
        tempo = fim - inicio;
                        
        if(tempo <= 0){
            tempo = tempo + 24;
        }
        
        System.out.println("O JOGO DUROU "+tempo+" HORA(S)");

    }
}