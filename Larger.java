import java.util.Scanner;
class Larger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the largest of two numbers. \n");
        
        System.out.println("Enter the first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("The "+num1+" is Larger");
        }else if(num2 > num1){
            System.out.println("The "+num2+" is Larger");
        }else{
            System.out.println("both are Equal");
        }
        
        sc.close();
        
    }
}