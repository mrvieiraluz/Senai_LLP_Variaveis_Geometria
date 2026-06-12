import java.util.Scanner;
public class Bola {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Digite o raio e a altura:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = Math.pow(a, 2)*3.14;
    double d = c + (2*3.14*a*b);
    System.out.println(d);
    
    sc.close();
    }   
}
