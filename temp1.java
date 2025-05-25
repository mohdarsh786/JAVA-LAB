import java.util.*;

class Bank {
    private static int accountNumberCounter = 1001;
    private String name, address;
    private int accountNumber;
    private double balance;

    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumberCounter++;
        this.balance = balance;
    }

    public void displayInfo() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) 
    {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public void changeAddress(String newAddress) 
    {
        this.address = newAddress;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }
}

public class temp1 
{
    public static void main(String[] st) 
    {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter number of depositors: ");
        int n = data.nextInt();
        data.nextLine();
        Bank[] accounts = new Bank[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = data.nextLine();
            System.out.print("Enter Address: ");
            String address = data.nextLine();
            System.out.print("Enter Initial Balance: ");
            double balance = data.nextDouble();
            data.nextLine();
            accounts[i] = new Bank(name, address, balance);
        }

        while (true) 
{
    System.out.println("\n1. Print depositor info\n2. Deposit\n3. Withdraw\n4. Change Address\n5. Exit");
    System.out.print("Choose an option: ");
    int choice = data.nextInt();
    data.nextLine();

    if (choice == 5) break;

    System.out.print("Enter Account Number: ");
    int accNum = data.nextInt();
    data.nextLine();
    Bank account = null;

    for (int i = 0; i < n; i++) 
    {
        if (accounts[i].getAccountNumber() == accNum) 
        {
            account = accounts[i];
            break;
        }
    }

    if (account == null) {
        System.out.println("Account number not found.");
        continue;
    }

    switch (choice) 
    {
        case 1:
            account.displayInfo();
            break;
        case 2:
            System.out.print("Enter deposit amount: ");
            double deposit = data.nextDouble();
            data.nextLine(); // consume newline
            account.deposit(deposit);
            account.displayInfo();
            break;
        case 3:
            System.out.print("Enter withdrawal amount: ");
            double withdraw = data.nextDouble();
            data.nextLine(); // consume newline
            account.withdraw(withdraw);
            account.displayInfo();
            break;
        case 4:
            System.out.print("Enter new address: ");
            String newAddress = data.nextLine();
            account.changeAddress(newAddress);
            account.displayInfo();
            break;
        default:
            System.out.println("Invalid choice.");
    }
}
        data.close();
    }
}