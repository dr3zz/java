import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class _07DaysBetweenTwoDates {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String strFirst = input.next();
		String strSecond = input.next();
		System.out.println(daysBetween(strFirst, strSecond));
	}

	private static long daysBetween(String strFirst, String strSecond) {
		DateTimeFormatter dateFormat = DateTimeFormat.forPattern("dd-MM-yyyy");
		DateTime firstDate = dateFormat.parseDateTime(strFirst);
		LocalDate firstDateLocal = firstDate.toLocalDate();
		DateTime secondDate = dateFormat.parseDateTime(strSecond);
		LocalDate secondDateLocal = secondDate.toLocalDate();
		Days d = Days.daysBetween(firstDate, secondDate);
		long daysBetween = d.getDays();
		return daysBetween;

	}

}
