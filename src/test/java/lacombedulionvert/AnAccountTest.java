package lacombedulionvert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple AnAccount.
 */
public class AnAccountTest
{
    @Test
    public void opening_a_default_bank_account() {
        AnAccount account = new AnAccount();
        assertEquals(50, account.amount);
    }

    @Test
    public void opening_a_bank_account_and_directly_put_money_in_it() {
        AnAccount account = new AnAccount(100);
        assertEquals(150, account.amount);
    }
}
