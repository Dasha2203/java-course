package homework_6;

public class HomeWorkSix {
    public static void main(String[] args) {

        // ============== TASK 1
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

        // ============== TASK 2 *

        System.out.println("\n============== TASK *\n");
        ATM atm = new ATM(10, 25, 3);

        // check big number
        if (atm.withdraw(15000)) {
            System.out.println("You withdrew the money");
        } else {
            System.out.println("There are not enough funds in the ATM");
        }

        // when we have a small number of large bills
        if (atm.withdraw(500)) {
            System.out.println("\nYou withdrew the money");
        } else {
            System.out.println("\nThere are not enough funds in the ATM");
        }

        if (atm.withdraw(320)) {
            System.out.println("\nYou withdrew the money");
        } else {
            System.out.println("There are not enough funds in the ATM");
        }

        System.out.println("\nAt ATM: ");
        atm.showBanknotes();

        atm.refill(0, 100, 40);

        System.out.println("\nAt ATM: ");
        atm.showBanknotes();


        if (atm.withdraw(11)) {
            System.out.println("\nYou withdrew the money");
        } else {
            System.out.println("There are not enough funds in the ATM");
        }

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

class ATM {
    int banknotes20Count;
    int banknotes50Count;
    int banknotes100Count;

    private int currentAmount;

    ATM(int banknotes20Count, int banknotes50Count, int banknotes100Count) {
        this.banknotes20Count = banknotes20Count;
        this.banknotes50Count = banknotes50Count;
        this.banknotes100Count = banknotes100Count;

        this.currentAmount = 20 * banknotes20Count + 50 * banknotes50Count + 100 * banknotes100Count;
    }

    public void refill(int twenty, int fifty, int hundred) {
        this.banknotes20Count += twenty;
        this.banknotes50Count += fifty;
        this.banknotes100Count += hundred;

        this.currentAmount += 20 * twenty + 50 * fifty + 100 * hundred;
    }


    public boolean withdraw(int amount) {
        if (amount > this.currentAmount) return false;

        int count100 = Math.min(amount / 100, this.banknotes100Count);
        int restAmount = amount - count100 * 100;

        int count50 = Math.min(restAmount / 50, this.banknotes50Count);
        restAmount -= count50 * 50;

        int count20 = Math.min(restAmount / 20, this.banknotes20Count);
        restAmount -= count20 * 20;

        if (restAmount == 0) {
            System.out.printf("\nCount banknotes 20: %d", count20);
            System.out.printf("\nCount banknotes 50: %d", count50);
            System.out.printf("\nCount banknotes 100: %d", count100);

            this.banknotes20Count -= count20;
            this.banknotes50Count -= count50;
            this.banknotes100Count -= count100;

            return true;
        }

        if (restAmount > 0) {
            System.out.println("\nIncorrect amount");
        }

        return false;
    }

    public void showBanknotes() {
        System.out.printf("Banknotes 20: %b\n", this.banknotes20Count > 0);
        System.out.printf("Banknotes 50: %b\n", this.banknotes50Count > 0);
        System.out.printf("Banknotes 100: %b\n", this.banknotes100Count > 0);
    }
}
