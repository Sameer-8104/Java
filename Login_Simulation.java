import java.util.Scanner;
class Login_Simulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a simple login system. if the username is 'admin' and the password is 'password',print 'Login Successful';otherwise print 'Invalid Credentials'.\n");
        
        System.out.println("Enter Username :");
        String username = sc.nextLine();
        System.out.println("Enter Password :");
        String password = sc.nextLine();
        
        String uname = "admin";
        String pass = "password";
        
        if(username.equals(uname) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Credentials");
        }
        
        sc.close();
        
    }
}