import java.util.Scanner;
class Days{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day :");
        int day = sc.nextInt();
        switch(day){
        case 1: System.out.println(day + " is Monday ");
        break;
        case 2: System.out.println(day + " is Tuesday ");
        break;
        case 3: System.out.println(day + " is Wednesday ");
        break;
        case 4: System.out.println(day + " is Thursday ");
        break;
        case 5: System.out.println(day + " is Friday ");
        break;
        case 6: System.out.println(day + " is Saturday ");
        break;
        case 7: System.out.println(day + " is Sunday ");
        break;
        default:System.out.println(day + " is Invalid ");
        break;
        }
       
        sc.close();
        
    }
}