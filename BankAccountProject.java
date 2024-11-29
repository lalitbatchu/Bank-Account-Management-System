//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class BankAccountProject {
    Locale locale;
    Currency cur1;
    String symbol;
    int accNum;
    int balance;
    String accName;
    int pin;
    String streetNum;
    String cityName;
    String stateName;
    int zipCode;

    public BankAccountProject() {
        this.locale = Locale.US;
        this.cur1 = Currency.getInstance(this.locale);
        this.symbol = this.cur1.getSymbol(this.locale);
    }

    public void createAcc(int accNum, String accName, int pin, String streetNum, String cityName, String stateName, int zipCode) {
        this.accNum = accNum;
        this.accName = accName;
        this.balance = 0;
        this.pin = pin;
        this.streetNum = streetNum;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        System.out.println("Account was created successfully!");
        System.out.println("----------------------------------------------");
        System.out.println(" ");
    }

    public void depositMoney(String accName, int accNum, int pin, double depositAmount) {
        if (this.accNum != accNum) {
            System.out.println("You've entered the wrong account number. Please try again");
            System.out.println(" ");
        } else if (!this.accName.equals(accName)) {
            System.out.println("You've entered the wrong name. Please try again");
            System.out.println(" ");
        } else if (this.pin != pin) {
            System.out.println("You've entered the wrong pin. Please try again");
            System.out.println(" ");
        } else {
            this.balance = (int)((double)this.balance + depositAmount);
            System.out.println("----------------------------------------------");
            System.out.println("Deposit is successful!");
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }

    }

    public void withdrawMoney(String accName, int accNum, int pin, double withdrawAmount) {
        if (this.accNum != accNum) {
            System.out.println("You've entered the wrong account number. Please try again");
            System.out.println(" ");
        } else if (!this.accName.equals(accName)) {
            System.out.println("You've entered the wrong name. Please try again");
            System.out.println(" ");
        } else if (this.pin != pin) {
            System.out.println("You've entered the wrong pin. Please try again");
            System.out.println(" ");
        } else if ((double)this.balance >= withdrawAmount) {
            this.balance = (int)((double)this.balance - withdrawAmount);
            System.out.println("----------------------------------------------");
            System.out.println("Withdrawal is successful");
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        } else {
            System.out.println("Balance is insufficient");
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }

    }

    public void searchAccount(String accName, int accNum, int pin) {
        if (this.accNum != accNum) {
            System.out.println("You've entered the wrong account number. Please try again");
            System.out.println(" ");
        } else if (!this.accName.equals(accName)) {
            System.out.println("You've entered the wrong name. Please try again");
            System.out.println(" ");
        } else if (this.pin != pin) {
            System.out.println("You've entered the wrong pin. Please try again");
            System.out.println(" ");
        } else {
            System.out.println("These are your account details: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Your Balance is " + this.symbol + this.balance);
            System.out.println("Your Account Number is " + this.accNum);
            System.out.println("Your Account Name is " + this.accName);
            System.out.println("Your address is: " + this.streetNum + " " + this.cityName + ", " + this.stateName + " " + this.zipCode);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }

    public static BankAccountProject findAccount(ArrayList<BankAccountProject> accounts, int accNum) {
        Iterator var2 = accounts.iterator();

        BankAccountProject account;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            account = (BankAccountProject)var2.next();
        } while(account.accNum != accNum);

        return account;
    }

    public static void main(String[] args) {
        Locale locale = Locale.US;
        Currency cur1 = Currency.getInstance(locale);
        String symbol = cur1.getSymbol(locale);
        ArrayList<BankAccountProject> accountList = new ArrayList();

        int choice;
        do {
            System.out.println("********************************");
            System.out.println("1. Create A New Account");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Check Your Account Information");
            System.out.println("5. Exit");
            System.out.println("********************************");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            String accName;
            int pin;
            int accNum;
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter Your Full Name: ");
                    accName = scanner.nextLine();
                    accName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Make a pin (4 digits): ");
                    pin = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter Your Street Name (eg. 1234 Main Street): ");
                    String streeetNum = scanner.nextLine();
                    String streetNum = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter Your City Name");
                    String cityName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter Your State Name");
                    String stateName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter Your Zip Code");
                    int zipCode = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    int min = 10000000;
                    int max = 100000000;
                    accNum = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
                    System.out.println("This is your account number " + accNum);
                    System.out.println("----------------------------------------------");
                    BankAccountProject newAccount = new BankAccountProject();
                    newAccount.createAcc(accNum, accName, pin, streetNum, cityName, stateName, zipCode);
                    accountList.add(newAccount);
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your Name: ");
                    String accccname = scanner.nextLine();
                    accName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your account number: ");
                    accNum = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your pin: ");
                    pin = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.print("Enter the amount you want to withdraw: " + symbol + " ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println("----------------------------------------------");
                    BankAccountProject accountForWithdrawal = findAccount(accountList, accNum);
                    if (accountForWithdrawal != null) {
                        accountForWithdrawal.withdrawMoney(accName, accNum, pin, withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your Name: ");
                    String acccName = scanner.nextLine();
                    accName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your account number: ");
                    accNum = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your pin: ");
                    pin = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.print("Enter deposit amount: " + symbol);
                    double depositAmount = scanner.nextDouble();
                    System.out.println("----------------------------------------------");
                    BankAccountProject accountForDeposit = findAccount(accountList, accNum);
                    if (accountForDeposit != null) {
                        accountForDeposit.depositMoney(accName, accNum, pin, depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your Name: ");
                    String acccname = scanner.nextLine();
                    accName = scanner.nextLine();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your account number: ");
                    accNum = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter your pin: ");
                    pin = scanner.nextInt();
                    System.out.println("----------------------------------------------");
                    BankAccountProject accountForDetails = findAccount(accountList, accNum);
                    if (accountForDetails != null) {
                        accountForDetails.searchAccount(accName, accNum, pin);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 5);

    }
}
