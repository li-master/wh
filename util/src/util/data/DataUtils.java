package util.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
	
	
	private static SimpleDateFormat format_date=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");

	
	/**
	 * yyyy-MM-dd:HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String getDate(Date date) {
		return format_date.format(date);
	}
}
