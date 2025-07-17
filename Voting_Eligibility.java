import java.util.Scanner;
class Voting_Eligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if a person is eligble to vote. the legal voting age is 18.The program should print 'Eligible' or 'Not Eligible'.\n");
        
        System.out.println("Enter your Age :");
        int num = sc.nextInt();
        
        if(num >= 18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        
        sc.close();
        
    }
}