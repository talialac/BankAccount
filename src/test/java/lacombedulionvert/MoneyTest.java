package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void money_if_it_is_a_positive_number() {
        Money money_50 = new Money(50);
        assertEquals(50, Money.getValue());
    }

    @Test
    public void money_if_it_is_a_negative_number() {
        Money money_50 = new Money(-50);
        assertEquals(50, Money.getValue());
    }

    @Test
    public void change_money_value() {
        Money money_50 = new Money(50);
        Money.setValue(80);
        assertEquals(80, Money.getValue());
    }

    @Test
    public void change_money_with_neg_value_should_ignore_negative() {
        Money money_50 = new Money(50);
        Money.setValue(-80);
        assertEquals(80, Money.getValue());
    }
}
