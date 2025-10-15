package homework_6;

public class CreditCard {
    public double currentAmount;
    public int accountNumber;

    CreditCard(double amount, int accountNumber) {
        this.currentAmount = amount;
        this.accountNumber = accountNumber;
    }

    public void addFunds(double amount) {
        if (amount <= 0) {
            System.out.println("You cannot add negative amount");
        }
        this.currentAmount += amount;
    }

    public void withdraw(double amount) {
        if (this.currentAmount < amount) {
            System.out.println("Insufficient funds");
            return;
        }

        this.currentAmount -= amount;
    }

    public void showCardInfo() {
        System.out.printf("Current amount: %f\n", currentAmount);
        System.out.printf("Account number: %s\n", accountNumber);
    }
}