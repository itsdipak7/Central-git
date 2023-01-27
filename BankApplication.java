import java.util.Scanner;
public class BankApplication {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
    String name = sc.nextLine();
    String customerId = sc.nextLine();

    BankAccount obj1 = new BankAccount(name, customerId);
    obj1.menu();

  }
}

class BankAccount {
  double bal;
  double prevTransaction;
  String customerName;
  String customerId;

  BankAccount(String customerName, String customerId) {
    this.customerName = customerName;
    this.customerId = customerId;
  }

  void deposit(double amount) {
    if (amount != 0) {
      bal += amount;
      prevTransaction = amount;
    }
  }

  void withdraw(double amt) {
    if (amt != 0 && bal >= amt) {
      bal -= amt;
      prevTransaction = -amt;
    } else if (bal < amt) {
      System.out.println("Bank balance insufficient");
    }
  }

  void getPreviousTransaction() {
    if (prevTransaction > 0) {
      System.out.println("Deposited: " + prevTransaction);

    } else if (prevTransaction < 0) {
      System.out.println("Withdrawn: " + Math.abs(prevTransaction));
    } else {
      System.out.println("No transaction occured");
    }
  }

  void menu() {
    char option;
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome " + customerName);
    System.out.println("Your Id: " + customerId);
    System.out.println("\n");
    System.out.println("a) check Balance");
    System.out.println("b) Deposit Amount");
    System.out.println("c) Withdraw Amount");
    System.out.println("d) Previous Transaction");
    System.out.println("e) Exit");

    do {
      System.out.println("******************");
      System.out.println("Choose an Option");
      option = sc.next().charAt(0);
      System.out.println();

      switch (option) {

      case 'a':
        System.out.println("....................");
        System.out.println("Balance=" + bal);
        System.out.println(".................");
        System.out.println("\n");
        break;

      case 'b':
        System.out.println("....................");
        System.out.println("Enter an amount to deposit :");
        System.out.println(".................");
        double amt = sc.nextDouble();
        deposit(amt);
        System.out.println("\n");
        break;

      case 'c':
        System.out.println("....................");
        System.out.println("Enter an amount to withdraw :");
        System.out.println(".................");
        double amtW = sc.nextDouble();
        withdraw(amtW);
        System.out.println("\n");
        break;

      case 'd':
        System.out.println("....................");
        System.out.println("Previous Transaction :");
        getPreviousTransaction();
        System.out.println(".................");
        System.out.println("\n");
        break;

      case 'e':
        System.out.println("....................");
        break;
      default:
        System.out.println("choose a currect option to proceed");
        break;
      }

    }

    while (option != 'e');
    System.out.println("Thank you for using our banking services");

  }
}