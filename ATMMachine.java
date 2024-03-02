import java.util.Scanner;
class ATMMachine
{
    public static void main(String[] args) 
    {
        int balance=100000;
        int withdraw;
        int deposit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Insert your card and enter PIN number:");
        int pin=sc.nextInt();
        while(true)
        {
            System.out.println("Choose account options");
            System.out.println("1.Withdrawl");
            System.out.println("2.Deposit Amount");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter money to withdrawl");
                withdraw=sc.nextInt();
                if(balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("Take money and card");
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
                System.out.println("");
                break;
                case 2:
                System.out.println("Enter money to deposit");
                deposit=sc.nextInt();
                balance=deposit+balance;
                System.out.println("Successfully deposited");
                System.out.println("");
                break;
                case 3:
                System.out.println("Balance:"+balance);
                System.out.println("");
                break;
                case 4:
                System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice choose right choice");
            }


        }
    }
}