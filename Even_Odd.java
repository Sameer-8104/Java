import java.util.Scanner;
class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program that chechs if a given Number is Even or Odd\n");
        
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        
        if(num %2==0){
            System.out.println("The Number "+num+" is Even");
        }else{
            System.out.println("The Number "+num+ " is Odd");
        }
        
        sc.close();
        
    }
}