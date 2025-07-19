import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("program that takes a day of the week as a string (eg: 'Monday') and prints 'Weekday' or 'weekend'");
        System.out.println("Enter a day of Weeks :");
        String day = sc.nextLine();
        
        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
        System.out.println("Weekday");
        }else if(day.equals("Saturday")||day.equals("Sunday")){
            System.out.println("Weekend");
        }else{
            System.out.println("please Enter Correct day");
        }
        sc.close();
    
    }
}