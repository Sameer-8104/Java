import java.util.Scanner;
class Positive_or_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program that take an integer as input and prints wheather it is positive or negative");
        
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("The Number is Positive");
        }else if(num < 0){
            System.out.println("The Number is negative");
        }else if(num == 0){
            System.out.println("The Number is Origin");
        }else{
            System.out.println("Enter the Correct Number :");
        }
        
        sc.close();
        
    }
}