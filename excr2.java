/*Algoritmo para calcular a media
 * André Luis de Oliveria
 * 08/05/2023
*/
import java.util.Scanner;
public class excr2 {
    public static void main(String args[]) {
    Scanner texto = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    System.out.println("digite um numero: ");
    n1 = texto.nextInt ();
    System.out.println("digite outro numero: ");
    n2 = texto.nextInt ();
    System.out.println("digite mais um numero: ");
    n3 = texto.nextInt ();
    System.out.println("é ultimo numero: ");
    n4 = texto.nextInt ();
    n5 = n1*n1 + n2*n2 + n3*n3 + n4*n4;
    System.out.println("resultado deu: " + n5);
    
    texto.close();
    }
        
    }