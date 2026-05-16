import java.util.Scanner;
public class Sain {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite a altura, largura e altura:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = 2*((a*b)+(b*c)+(c*a));
    System.out.println(d);
    
    sc.close();
    }   
}