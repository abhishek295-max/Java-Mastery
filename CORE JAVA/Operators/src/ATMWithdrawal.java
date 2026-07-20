public class ATMWithdrawal {

    public static void main(String[] args) {

        double accountBalance = 25000;
        double withdrawalAmount = 10000;

        System.out.println("========== ATM ==========");
        System.out.println("Account Balance : ₹" + accountBalance);
        System.out.println("Withdrawal Amount : ₹" + withdrawalAmount);
        System.out.println("--------------------------");

        if (accountBalance >= withdrawalAmount) {

            accountBalance = accountBalance - withdrawalAmount;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : ₹" + accountBalance);

        } else {

            System.out.println("Insufficient Balance");

        }

        System.out.println("=========================");
    }
}