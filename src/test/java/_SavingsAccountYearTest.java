import finances.SavingAccountYear;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class _SavingsAccountYearTest {
    @Test
    public void  startingBalance() {
        assertEquals(10000, newAccount().startingBalance());
    }

    private SavingAccountYear newAccount() {
        return new SavingAccountYear(10000, 10);
    }

    @Test
    public void endingBalance() {
        assertEquals(11000, newAccount().endingBalance());
    }

    @Test
    public void nextYearStaringBalanceShouldEdualThisYearsEndingBalance() {

        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
    }
    @Test
    public void nextYearInterestEqualsThisYearInterestRate() {
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
    }
}
