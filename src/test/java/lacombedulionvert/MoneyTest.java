package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void money_if_it_is_a_positive_number() {
        Money money_50 = new Money(50);
        assertEquals(50, Money.value);
    }
}
