import java.util.Scanner;
public class Esfera {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Digite o raio:");
    int a = sc.nextInt();
    double b = Math.pow(a, 2)*3.14*4;
    System.out.println(b);
    
    sc.close();
    }   
}
