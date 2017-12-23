package finances;
//financial prediction for business abc
public class SavingAccountYear {
    private int interestRate =0;
    private int startingBalance =0;
    private int capitalGainsAmount =0;
    private int totalWithdrow =0;

    public SavingAccountYear() {

    }

    public SavingAccountYear(int staringBalance, int interestRate) {
        this.interestRate = interestRate;
        this.startingBalance = staringBalance;
    }
    public SavingAccountYear(int staringBalance,int capitalGainsAmount, int interestRate) {
        this.interestRate = interestRate;
        this.startingBalance = staringBalance;
        this.capitalGainsAmount = capitalGainsAmount;
    }

    public SavingAccountYear nextYear() {
        return  new SavingAccountYear(this.endingBalance(),interestRate);

    }

    public int endingBalance() {
        int modifiedStart = startingBalance -totalWithdrow;
        return modifiedStart + (modifiedStart * interestRate / 100);
    }

    public int startingBalance() {
        return startingBalance;
    }

    public int interestRate() {
        return interestRate;
    }

    public int startingPrinciple() {
        return startingBalance - capitalGainsAmount; // chacking for minar change modification
    }
    public void withdraw(int amount) {
        this.totalWithdrow = amount;
    }

    public int endingPrincipal() {
        return startingPrinciple() - totalWithdrow; // chacking for git project modification!
    }
}
