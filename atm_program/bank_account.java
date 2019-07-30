package atm_program;

public class bank_account {

    private String account_number = "123456789";
    private double balance = 50.0;
    private String customer_name = "Kelly";
    private String email = "kellyding43@gmail.com";
    private String phone_number = "4086097073";

    void print_balance(){System.out.println("Your balance is : " + balance);}

    // deposit money (this should increment the balance field).
    double deposit(double amt){
        if(amt > 0){
            balance += amt;
        }
        return balance;
    }

    // withdraw money (This should deduct from the balance field)
    // but not allow the withdrawal to complete if their are insufficient money and print the
    // balance with name of customer
    double withdraw(double amt){
        if(amt > 0){
            if(balance >= amt)
                balance -= amt;
            else {
                System.out.println("Not enough balance in your account");
                System.out.println("Customer Name: " + customer_name);
                System.out.println("Balance: " + balance);
            }
        }

        return balance;
    }

    // print Customer Name, Account Number, Balance, Email and Phone Number
    void print_info(){
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Account Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone_number);
    }
}
