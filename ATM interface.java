import java.util.Scanner;
class bank_account{
    private double balance;
    public bank_account(double initialBalance){
      balance=initialBalance; 
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Rs."+amount+" deposited successfully");
        } else{
            System.out.println("Invalid deposit amount.");
        }
        }
        public void withdraw(double amount){
            if (amount<=0){
                System.out.println("Withdrawal amount must be greater than 0.");
            }
            else if(amount>balance){
                System.out.println("Insufficient balance. Transaction failed.");
            }
            else {
                balance-=amount;
                System.out.println("Rs."+amount+" withdrawn successfully"); 
            }
            }
            public void checkBalance(){
                System.out.println("Current Balance : Rs."+balance);
            }
        }
            public class atm_machine{
                public static void main (String args[]){
                    Scanner sc=new Scanner(System.in);
                    bank_account account=new bank_account(1000.00);//creating a bank account with initial amount of Rs.1000
                    boolean exit=false;
                    System.out.println("*****WELCOME*****");
                    while(!exit){
                        System.out.println("\nSelect your choice.");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Exit");
                        System.out.println("Enter your choice : ");
                        int choice=sc.nextInt();
                        switch(choice){
                            case 1:
                                System.out.println("Enter amount to deposit: Rs.");
                                double depositAmt=sc.nextDouble();
                                account.deposit(depositAmt);
                                break;
                            case 2 :
                                System.out.println("Enter amount to withdraw: Rs.");
                                double withdrawAmt=sc.nextDouble();
                                account.withdraw(withdrawAmt);
                                break;
                            case 3 :
                                account.checkBalance();
                                break;
                            case 4 :
                                System.out.println("THANK YOU!");
                                exit= true;
                                break;
                                default:
                                    System.out.println("Invalid choice. Please select between 1 and 4.");
                                }
                            }
                        }
                    }
                    
                        
                    
                
            
        
    
