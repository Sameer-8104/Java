import java.util.Scanner;
class Pass_or_Fail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A student is considered to have passed an exam if they score 50 or more. write a program that takes a students score as input and print 'PASS' or 'FAIL'.\n");
        
        System.out.println("Enter your Score :");
        int score = sc.nextInt();
        
        if(score >= 50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        
        sc.close();
        
    }
}