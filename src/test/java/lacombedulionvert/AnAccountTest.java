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
    public void creation_of_a_bank_account() {
        AnAccount account = new AnAccount();
        assertEquals(50, account.amount);
    }
}
