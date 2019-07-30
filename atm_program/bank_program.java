package atm_program;

import java.util.Scanner;

public class bank_program {
    public static void main (String[] args){
        bank_account account = new bank_account();
        int selection;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Main Menu");
            System.out.println("1. Deposit\n2. Withdraw\n3. Print your account information\n4. Exit");
            while(!sc.hasNextInt()){
                String input = sc.next();
                System.out.println("Invalid input. Please enter again.");
            }
            selection = sc.nextInt();
            Scanner scanner = new Scanner(System.in);
            switch (selection){
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double dep_amt = scanner.nextDouble();
                    account.deposit(dep_amt);
                    account.print_balance();
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double wit_amt = scanner.nextDouble();
                    account.withdraw(wit_amt);
                    account.print_balance();
                    break;
                case 3:
                    account.print_info();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }while (selection != 4);

    }
}
