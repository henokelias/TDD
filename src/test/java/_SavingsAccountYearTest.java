import finances.SavingAccountYear;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class _SavingsAccountYearTest {
    @Test
    public void  startingBalance() {
        SavingAccountYear account = new SavingAccountYear(10000, 10);
        assertEquals(10000, account.startingBalance());
    }
    @Test
    public void endingBalance() {
        SavingAccountYear account = new SavingAccountYear(10000, 10);
        assertEquals(11000, account.endingBalance());
    }

    @Test
    public void nextYearStaringBalanceShouldEdualThisYearsEndingBalance() {

        SavingAccountYear thisYear = new SavingAccountYear(10000, 10);
        assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
    }
    @Test
    public void nextYearInterestEqualsThisYearInterestRate() {
        SavingAccountYear thisYear = new SavingAccountYear(10000, 10);
        assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
    }
}
