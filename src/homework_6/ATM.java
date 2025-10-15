package homework_6;

public class ATM {
    public int banknotes20Count;
    public int banknotes50Count;
    public int banknotes100Count;

    private int currentAmount;

    ATM(int banknotes20Count, int banknotes50Count, int banknotes100Count) {
        this.banknotes20Count = banknotes20Count;
        this.banknotes50Count = banknotes50Count;
        this.banknotes100Count = banknotes100Count;

        this.currentAmount = 20 * banknotes20Count + 50 * banknotes50Count + 100 * banknotes100Count;
    }

    public void refill(int twenty, int fifty, int hundred) {
        if (twenty < 0 || fifty < 0 || hundred < 0) {
            System.out.println("You cannot add negative count of banknotes");
            return;
        }
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