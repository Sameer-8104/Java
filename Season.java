import java.util.Scanner;
class Season{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Months :");
        int num = sc.nextInt();
        switch(num){
        case 12: 
        case 2:
        case 3: System.out.println(num + " is Winter");
        break;
        
        case 4: 
        case 5: 
        case 6: System.out.println(num + " is Spring ");
        break;
        
        case 7: 
        case 8: 
        case 9: System.out.println(num + " is Summer ");
        break;
        
        case 10: 
        case 11: 
        case 1: System.out.println(num + " is Autumn ");
        break;
        
        default:System.out.println(num + " is Invalid ");
        break;
        }
       
        sc.close();
        
    }
}