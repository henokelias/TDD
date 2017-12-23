import finances.SavingAccountYear;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class _SavingsAccountYearTest {
    @Test
    public void  startingBalanceMatchesConstructor() {
        assertEquals(10000, newAccount().startingBalance());
    }

    private SavingAccountYear newAccount() {
        return new SavingAccountYear(10000, 10);
    }

    @Test
    public void endingBalanceAppliesInterestRate() {
        assertEquals(11000, newAccount().endingBalance());
    }

    @Test
    public void nextYearStaringBalanceEqualThisYearsEndingBalance() {

        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
    }
    @Test
    public void nextYearInterestEqualsThisYearInterestRate() {
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
    }
    @Test
    public void withdrawingFundsOccursAtTheBeginningOfTheYear() {
        SavingAccountYear year = new SavingAccountYear(10000,10);
        year.withdraw(1000);
        assertEquals(9900,year.endingBalance());
    }
//    @Test
//    public void withdrawingMoreThanPrincipalIncursCapitalGainsTax() {
//        SavingAccountYear year = new SavingAccountYear(10000, 7000, 10);
//        year.withdraw(3000);
//        assertEquals(7700, year.endingBalance());
//        year.withdraw(5000);
//        assertEquals(2000 + 200 - (1250),  year.endingBalance());
//    }
    @Test
    public void startingPrinciple() {
        SavingAccountYear year = new SavingAccountYear(10000,7000,10);
        assertEquals(3000, year.startingPrinciple());
    }
    @Test
    public void endingPrinciple() {
        SavingAccountYear year = new SavingAccountYear(10000, 7000,10);
        assertEquals("Starting Principle:", 3000, year.startingPrinciple());
        year.withdraw(2000);
        assertEquals("Ending Principal",1000, year.endingPrincipal());
    }
}
