import java.util.Scanner;
interface BankAccount {
void deposit(double amount);
    void withdraw(double amount);
    void balanceEnquiry();
}
class Account implements BankAccount {
double balance = 1000;
public void deposit(double amount) {
    if (amount <= 0)
      throw new IllegalArgumentException("Invalid Deposit Amount");
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
public void withdraw(double amount) {
 if (amount <= 0 || amount > balance)
    throw new IllegalArgumentException("Insufficient Balance");
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
public void balanceEnquiry() {
    System.out.println("Current Balance: " + balance);
    }
}

public class Bank {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   BankAccount acc = new Account();
try {
System.out.println("Enter Deposit Amount:");
double dep = sc.nextDouble();
acc.deposit(dep);
System.out.println("Enter Withdrawal Amount:");
double wit = sc.nextDouble();
acc.withdraw(wit);
 acc.balanceEnquiry();
 } catch (IllegalArgumentException e) {
System.out.println("Exception: " + e.getMessage());
        } 
sc.close();
        }
}
