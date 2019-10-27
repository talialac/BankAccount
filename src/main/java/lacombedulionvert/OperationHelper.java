package lacombedulionvert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OperationHelper {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");
    private Money amount;
    LocalDateTime date_time;

    public static Operation create(Money money_50, String string_date) {
        LocalDateTime check_date = createDateFromFormat(string_date);
        return new Operation(money_50, check_date);
    }

    private static LocalDateTime createDateFromFormat(String dateFormat) {
        LocalDateTime check_date;
        try {
            check_date = LocalDateTime.parse(dateFormat, DATE_TIME_FORMATTER);
        } catch (DateTimeParseException e) {
            check_date = null;
        }
        return check_date;
    }


}
