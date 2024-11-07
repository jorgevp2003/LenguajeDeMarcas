package BackEnd;
import java.util.Scanner;

public class LetraNumeroAbecedario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 


        System.out.println("Introduce un parámetro: ");
        char letra = sc.next().charAt(0); 


        letra = Character.toUpperCase(letra);


        if (letra >= 'A' && letra <= 'Z') {
            int posicion = letra - 'A' + 1;
            System.out.println("La posición de la letra en el abecedario es: " + posicion );
        } else {
            System.out.println("No es un carácter válido.");
        }

        // Cierra el scanner
        sc.close();
    }
}