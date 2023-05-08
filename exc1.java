import java.util.Scanner;
public class exr1{
public static void main(String args[]){
    Scanner leitor = new Scanner(System.in);
    double n1, n2, n3, n4, media;
    media = n1 = n2 = n3 = n4 = 0;
    System.out.println("insire 4 notas: ");
    n1= leitor.nextDouble();
    n2= leitor.nextDouble();
    n3= leitor.nextDouble();
    n4= leitor.nextDouble();
    media = (n1+n2+n3+n4)/4;
    System.out.println("A media é: "+ media);


    
    }
}