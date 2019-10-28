package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple AnAccount.
 */
public class AnAccountTest
{
    @Test
    public void opening_a_default_bank_account() {
        AnAccount account = new AnAccount();
        assertEquals(50, account.getAmount());
    }

    @Test
    public void opening_a_bank_account_and_directly_put_money_in_it() {
        Money amount_100 = new Money(100);
        AnAccount account = new AnAccount(amount_100);
        assertEquals(150, account.getAmount());
    }

    @Test
    public void opening_a_bank_account_and_directly_put_money_in_it_with_a_negative_number() {
        Money amount_100 = new Money(-100);
        AnAccount account = new AnAccount(amount_100);
        assertEquals(150, account.getAmount());
    }

    @Test
    public void deposit_money_in_a_default_account_already_opened() {
        AnAccount account = new AnAccount();
        Money amount_50 = new Money(50);
        account.deposit(amount_50);
        int expected = 100;
        assertEquals(expected, account.getAmount());
    }

    @Test
    public void deposit_money_in_an_account_already_opened() {
        Money amount_100 = new Money(100);
        Money amount_50 = new Money(50);
        AnAccount account = new AnAccount(amount_100);
        account.deposit(amount_50);
        int expected = 200;
        assertEquals(expected, account.getAmount());
    }

    @Test
    public void withdrawal_money() {
        Money amount_20 = new Money(20);
        Money amount_50 = new Money(50);
        AnAccount account_with_100_in_it = new AnAccount(amount_50);
        account_with_100_in_it.withdrawal(amount_20);
        int expected = 80;
        assertEquals(expected, account_with_100_in_it.getAmount());
    }

    @Test
    public void client_can_not_withdrawal_more_than_the_amount_in_the_account() {
        Money money_150 = new Money(150);
        Money amount_50 = new Money(50);
        AnAccount account_with_100_in_it = new AnAccount(amount_50);
        account_with_100_in_it.withdrawal(money_150);
        int expected = 0;
        assertEquals(expected, account_with_100_in_it.getAmount());
    }

    @Test
    public void print_historic_of_last_deposit() {
        Money amount_100 = new Money(100);
        Money amount_50 = new Money(50);
        AnAccount account = new AnAccount(amount_100);
        account.deposit(amount_50);
        account.printHistoric();
    }

    @Test
    public void print_historic_of_last_withdrawal() {
        Money amount_100 = new Money(100);
        Money amount_50 = new Money(50);
        AnAccount account = new AnAccount(amount_100);
        account.withdrawal(amount_50);
        account.printHistoric();
    }

    @Test
    public void print_historic_of_operations() {
        Money amount_1000 = new Money(1000);
        Money amount_20 = new Money(20);
        Money amount_50 = new Money(50);
        AnAccount account_1050 = new AnAccount(amount_1000);

        account_1050.withdrawal(amount_50);
        account_1050.deposit(amount_20);
        account_1050.withdrawal(amount_1000);

        account_1050.printHistoric();
    }

    @Test
    public void print_historic_of_operations_when_last_withdrawal_is_bigger_than_amount_account() {
        Money amount_1000 = new Money(1000);
        Money amount_1 = new Money(1);
        Money amount_19 = new Money(19);
        Money amount_20 = new Money(20);
        Money amount_50 = new Money(50);
        AnAccount account_1050 = new AnAccount(amount_1000);

        account_1050.withdrawal(amount_50);
        account_1050.deposit(amount_20);
        account_1050.withdrawal(amount_1000);
        account_1050.withdrawal(amount_50);

        account_1050.printHistoric();
    }
}
