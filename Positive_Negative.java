import java.util.Scanner;
class Positive_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program that check if a number is 'Positive', 'Negative',or 'Zero'\n");
        
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else if(num == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Enter the Correct Number :");
        }
        
        sc.close();
        
    }
}