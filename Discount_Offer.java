import java.util.Scanner;
class Discount_Offer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A shop offers 10% discount if the purchase amount is over $100. write a program that takes the purchse amount and calculates the final amount to be paid. \n");
        
        System.out.println("Enter the purchase Amount :");
        int amount = sc.nextInt();
        if(amount<=100){
            System.out.println("You have to Paid: "+ amount);
        }else if(amount>100){
        int discount = (amount*10)/100;
        int amountToBePaid = amount-discount;
        System.out.println("After applying the discount, you have to paid :"+amountToBePaid);
        }
        
        sc.close();
        
    }
}