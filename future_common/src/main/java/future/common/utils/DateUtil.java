package future.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date parseDateStr(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date result = null;
        try {
            result = sdf.parse(dateStr);
        } catch (Exception e) {

        }
        return result;
    }
}
