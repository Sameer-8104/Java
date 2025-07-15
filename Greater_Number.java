//program to find greater among 3 numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-: Greater Among 3 Numbers :- \n");
        
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number :");
        int c = sc.nextInt();
        
        if(a > b && a > c){
            System.out.println(a + " is Greater then " + b + " and "+ c);
        }else if(b > a && b > c){
            System.out.println(b + " is Greater then " + a + " and "+ c);
        }else if(c > a && c > a){
            System.out.println(c + " is Greater then " + a + " and "+ b);
        }
        sc.close();
    }
}