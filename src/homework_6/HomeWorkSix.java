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

        System.out.println("\nCredit one add: " + 500.89);
        System.out.println("Credit two add: " + 490.9);
        System.out.println("Credit two withdraw: " + 55.87);
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
