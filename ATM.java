
import java.util.Scanner;
public class ATM {
public Account acc;
public Scanner sca;
public ATM(Account acc)
{
this.acc = acc;
this.sca = new Scanner(System.in);
}
public void displayMenu()
{
int choice;
do {
System.out.println("\n Welcome to banking serivces");
System.out.println("1. Check Balance");
System.out.println("2. Deposit amount");
System.out.println("3. Withdraw amount");
System.out.println("4. Exit");
System.out.print("Enter a choice: ");
choice = sca.nextInt();
switch (choice) {
case 1:
checkBalance();
break;
case 2:
deposit();
break;
case 3:
withdraw();
break;
case 4:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice.......\n Please enter a valid choice");
}
} while (choice != 4);
}
private void checkBalance()
{
System.out.println("Your balance is:"+ acc.getBalance());
}
private void deposit()
{
System.out.print("Enter deposit amount: ");
double amount = sca.nextDouble();
if (amount > 0) {
acc.deposit(amount);
System.out.println( "Amount deposited successfully.\n"+"The Deposited amount is "+ amount);
} 
else {
System.out.println("Invalid deposit amount.");
}
}
private void withdraw() 
{
System.out.print("Enter withdrawal amount: ");
double amount = sca.nextDouble();
if (amount > 0) {
if (acc.withdraw(amount)) 
{
System.out.println(" Withdrawal successfully.\n"+"The withdrawn amount is  "+ amount);
}
else {
System.out.println("Insufficient Balance....");
}
}
 else {
System.out.println("Invalid withdrawal amount.");
}
}
public static void main(String[] args) {
Account account = new Account(1000.0);
ATM atm = new ATM(account);
atm.displayMenu();
}
}
