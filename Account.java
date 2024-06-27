public class Account {
private double balance;
public Account(double initialBalance) {
if (initialBalance > 0.0) {
 balance = initialBalance;
 } else {
 balance = 0.0;
 }
}
 public void deposit(double amount) {
 if (amount > 0) {
 balance += amount;
}
}
public boolean withdraw(double amount) {
 if (amount > balance) {
 return false;
 } else {
 balance -= amount;
 return true;
 }
 }
 public double getBalance() {
return balance;
 }
 }
    