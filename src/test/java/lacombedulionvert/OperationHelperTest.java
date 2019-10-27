package lacombedulionvert;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class OperationHelperTest {
    @Test
    public void create_should_have_correct_data_when_building_date_operation() {
        Money money_50 = new Money(50);
        Operation expectedOperation = new Operation(money_50,
                LocalDateTime.of(2019, 4, 21, 14, 54));

        Operation resultOperation = OperationHelper.create(money_50, "2019-04-21 14h54");

        Assert.assertEquals(expectedOperation, resultOperation);
    }
}
