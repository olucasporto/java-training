import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount obj1 = new BankAccount("XYZ", "BA0001");
		obj1.showMenu();

	}
}

class BankAccount {

	double balance;
	double previousTransaction;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	void deposit(double amount) {
		if (amount != 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}

	void withdraw(double amount) {
		if (amount != 0) {
			balance -= amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured...");
		}

	}

	void showMenu() {
		char opt = '\0';
		char option;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is" + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balanace");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");

		do {
			System.out.println("==================================================");
			System.out.print("Enter an option: ");
			opt = scanner.next().charAt(0);
			option = Character.toUpperCase(opt);
			System.out.println("==================================================");
			System.out.println("\n");

			switch (option) {

			case 'A':
				System.out.println("Option selected: \nA. Check Balance \n");
				System.out.println("---------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("---------------------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("Option selected: \nB. Deposit \n");
				System.out.println("---------------------------------");
				System.out.print("Enter an amount to deposit: ");
				double amount = scanner.nextDouble();
				deposit(amount);
				System.out.println("---------------------------------");
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("Option selected: \nC. Withdraw \n");
				System.out.println("---------------------------------");
				System.out.print("Enter an amount to withdraw: ");
				double amount2 = scanner.nextDouble();
				withdraw(amount2);
				System.out.println("---------------------------------");
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("---------------------------------");
				System.out.println("Option selected: \nD. Previous transaction \n");
				getPreviousTransaction();
				System.out.println("---------------------------------");
				System.out.println("\n");
				break;

			case 'E':
				System.out.println("Option selected: \nE. Exit \n");
				System.out.println("*************************************");
				break;

			default:
				System.out.println("Invalid Option... Please, try again.");
			}

		} while (option != 'E');

		System.out.println("Thank you for using our services!");
		scanner.close();
	}
}