import java.util.Scanner;

public class Uri1014{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int distancia;
        double consumoT;
        double consumoM;

        distancia = teclado.nextInt();
        consumoT = teclado.nextDouble();

        consumoM = distancia/consumoT;

        System.out.printf("%.3f km/l\n", consumoM);




    }
}