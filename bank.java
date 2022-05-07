

import java.util.Scanner;

class bank 
{
    private double amount = 5000;
    private int pwd;
   
       
    public void deposit() 
    {
        System.out.print("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd == 123){
        System.out.print("Enter your amount ");
        double money = sc.nextInt();
        double total = (money+amount);
        System.out.println("Your total balance is : " + total);
        }
        else 
        {
            System.out.println("Incorrect possword....");
        }
    }
    
    public void withdrawl() 
    {
        
        System.out.print("Enter your password: ");
        Scanner sc1 = new Scanner(System.in);
        pwd = sc1.nextInt();
        if(pwd == 123){
        System.out.println("Enter your withdrawl amount: ");
        double mon = sc1.nextInt();
        double total = (amount - mon);
       
        System.out.println("Your total balance is : " + total);
       
        }
        else 
        {
            System.out.println("Incorrect possword....");
        }
    }
    public void balance()
    {
         System.out.print("Enter your password: ");
        Scanner sc2 = new Scanner(System.in);
        pwd = sc2.nextInt();
        if(pwd == 123){
        System.out.println("Your balance is: "+ amount);
        }
        else 
        {
            System.out.println("Incorrect possword....");
        }
    }
    
}

class Customer 
{
      
    public static void main(String[] args) {
              
        bank b = new bank();
        int ch;
        int j =0;
        
        while(j == 0)///// this while used for roll back from the first untill press 4
         {
        System.out.println("Our Service is:  ");
        System.out.println("\n 1.  Deposit Money ");
        System.out.println("\n 2.  Withdrawl Money ");
        System.out.println("\n 3.  Check Balance");
        System.out.println("\n 4.  Want to Exit");
         System.out.print("Please enter your choise: ");
        
         Scanner sc1 = new Scanner(System.in);
         ch = sc1.nextInt();
     
         
        switch(ch)
        {
            
            case 1: b.deposit();
            break;
            case 2: b.withdrawl();
            break;
            case 3: b.balance();
            break;
            
            case 4: System.exit(0);
            default: System.out.println("Your enter is a wrong...");
                
         
         }
       }
        
    }
}
