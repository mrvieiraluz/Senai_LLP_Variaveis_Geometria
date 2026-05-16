import java.util.Scanner;
public class Jai {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Digite o raio:");
    int a = sc.nextInt();
    double c = Math.pow(a, 2)*3.14;
    System.out.println(c);
    
    sc.close();
    }   
}