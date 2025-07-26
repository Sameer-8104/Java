import java.util.Scanner;
class Fizz_Buzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        //i = 1;
        //i = i + 1;
        for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            System.out.println("Fizz Buzz");
        }else if(i %3 == 0){
            System.out.println("Fizz");
        }else if(i %5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
        }
        sc.close();
        
    }
}