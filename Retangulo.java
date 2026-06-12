import java.util.Scanner;
public class Retangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Digite a altura e a base:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a*b);
    
    sc.close();
    }   
}
