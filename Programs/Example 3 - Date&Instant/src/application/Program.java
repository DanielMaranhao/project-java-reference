package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// This API is "deprecated", it's better to use java.time
		
		System.out.println("----- OLD TIME API -----");
		System.out.println();
		
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdfDateTimeUtc = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdfDateTimeUtc.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date currentDate = new Date();
		Date startingDate = new Date(0L);
		
		Date date = sdfDate.parse("25/06/2018");
		Date dateTime = sdfDateTime.parse("25/06/2018 15:42:07");
		Date dateTimeUtc = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("currentDate: " + sdfDateTime.format(currentDate));
		System.out.println("startingDate: " + sdfDateTimeUtc.format(startingDate));
		System.out.println("date: " + sdfDate.format(date));
		System.out.println("dateTime: " + sdfDateTime.format(dateTime));
		System.out.println("dateTimeUtc (Local Time Zone): " + sdfDateTime.format(dateTimeUtc));
		System.out.println("dateTimeUtc (UTC): " + sdfDateTimeUtc.format(dateTimeUtc));
		System.out.println();
		
		// A date in UTC minus the same date in local time zone, to get the local-UTC offset
		// Logic: Suppose you live in a -3 UTC time zone. 15h there is already 18h in UTC. So diff would be 15 - 18 = -3
		long diff = dateTimeUtc.getTime() - dateTime.getTime();
		int utcOffset = (int) TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
		System.out.println("Local Time Zone: " + utcOffset + " UTC");
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateTime);
		cal.add(Calendar.HOUR, 4);
		dateTime = cal.getTime();
		
		System.out.println("dateTime (+4h): " + sdfDateTime.format(dateTime));
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH) + 1;
		
		System.out.println("Minutes (dateTime): " + minutes);
		System.out.println("Month (dateTime): " + month);
		System.out.println();		
		
		// Using the java.time API
		
		System.out.println("----- NEW TIME API -----");
		System.out.println();
		
		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtfDateTimeUtc = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("GMT"));
		
		Instant currentMoment = Instant.now();
		Instant startingMoment = Instant.EPOCH;		
		
		Instant dateMoment = LocalDate.parse("2018-06-25").atStartOfDay(ZoneId.systemDefault()).toInstant();
		Instant dateTimeMoment = LocalDateTime.parse("2018-06-25T15:42:07").atZone(ZoneId.systemDefault()).toInstant();
		Instant dateTimeUtcMoment = Instant.parse("2018-06-25T15:42:07Z");		
		
		System.out.println("currentMoment: " + dtfDateTime.format(currentMoment));
		System.out.println("startingMoment: " + dtfDateTimeUtc.format(startingMoment));		
		System.out.println("dateMoment: " + dtfDate.format(dateMoment));
		System.out.println("dateTimeMoment: " + dtfDateTime.format(dateTimeMoment));
		System.out.println("dateTimeUtcMoment (Local Time Zone): " + dtfDateTime.format(dateTimeUtcMoment));
		System.out.println("dateTimeUtcMoment (UTC): " + dtfDateTimeUtc.format(dateTimeUtcMoment));
		System.out.println();
		
		// The difference in hours between an instant in local time zone and the same instant in UTC, to get the local-UTC offset
		// Logic: the function below returns the second parameter minus the first parameter, so it is the same logic as the other offset calculation.
		long utcOffsetMoment = ChronoUnit.HOURS.between(dateTimeMoment, dateTimeUtcMoment);
		System.out.println("Local Time Zone: " + utcOffsetMoment + " UTC");
		System.out.println();
		
		dateTimeMoment = dateTimeMoment.plus(4, ChronoUnit.HOURS);		
		
		System.out.println("dateTimeMoment (+4h): " + dtfDateTime.format(dateTimeMoment));
		
		System.out.println("Minutes (dateTimeMoment): " + dateTimeMoment.atZone(ZoneId.systemDefault()).getMinute());
		System.out.println("Month (dateTimeMoment): " + dateTimeMoment.atZone(ZoneId.systemDefault()).getMonthValue());
	}
}
