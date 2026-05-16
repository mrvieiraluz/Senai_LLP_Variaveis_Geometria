import java.util.Scanner;
public class Naim {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Digite a altura e a base:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = (a*b)/2;
    System.out.println(c);
    
    sc.close();
    }   
}