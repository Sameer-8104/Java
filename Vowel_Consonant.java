import java.util.Scanner;
class Vowel_Consonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program that takes a single character as input and determines wheather it is a 'Vowel' or 'Consonant'. \n");
        
        System.out.println("Enter an Alphabet :");
        char ch = sc.next().charAt(0);
        
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch =='o'||ch =='u'){
            System.out.println(ch+" Is a Vowel");
        }else{
            System.out.println(ch+" Is a Consonant");
        }
        
        sc.close();
        
    }
}