package finances;

public class SavingAccountYear {
    private int interestRate =0;
    private int startingBalance =0;
    public SavingAccountYear() {

    }

    public SavingAccountYear(int staringBalance, int interestRate) {
        this.interestRate = interestRate;
        this.startingBalance = staringBalance;
    }

    public SavingAccountYear nextYear() {
        return  new SavingAccountYear(this.endingBalance(),interestRate);

    }

    public int endingBalance() {
        return startingBalance() + (startingBalance() * interestRate /100);
    }

    public int startingBalance() {
        return startingBalance;
    }

    public int interestRate() {
        return interestRate;
    }
}
