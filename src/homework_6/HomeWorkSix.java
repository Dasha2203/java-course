package homework_6;

public class HomeWorkSix {
    public static void main(String[] args) {
        CreditCard creditCardOne = new CreditCard(100, 12345678);
        CreditCard creditCardTwo = new CreditCard(500, 87654321);
        CreditCard creditCardThree = new CreditCard(1000, 88888888);

        System.out.println("\nCredit card 1: \n");
        creditCardOne.showCardInfo();

        System.out.println("\nCredit card 2: \n");
        creditCardTwo.showCardInfo();

        System.out.println("\nCredit card 3: \n");
        creditCardThree.showCardInfo();

        creditCardOne.addFunds(500.89);

        creditCardTwo.addFunds(490.9);

        creditCardThree.withdraw(55.87);

        System.out.println("\n================= After operations ==========");

        System.out.println("\nCredit card 1: \n");
        creditCardOne.showCardInfo();

        System.out.println("\nCredit card 2: \n");
        creditCardTwo.showCardInfo();

        System.out.println("\nCredit card 3: \n");
        creditCardThree.showCardInfo();

        creditCardThree.withdraw(5000);

        System.out.println("\nCredit card 3: \n");
        creditCardThree.showCardInfo();
    }
}


class CreditCard {
    double currentAmount;
    int accountNumber;

    CreditCard(double amount, int accountNumber) {
        this.currentAmount = amount;
        this.accountNumber = accountNumber;
    }

    void addFunds(double amount) {
        this.currentAmount += amount;
    }

    void withdraw(double amount) {
        if (this.currentAmount < amount) {
            System.out.println("Insufficient funds");
            return;
        }

        this.currentAmount -= amount;
    }

    void showCardInfo() {
        System.out.printf("Current amount: %f\n", currentAmount);
        System.out.printf("Account number: %s\n", accountNumber);
    }
}
