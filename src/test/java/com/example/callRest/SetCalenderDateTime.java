package com.example.callRest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SetCalenderDateTime {
	
	private static final String SimpleDateFormat = null;

	public static void main(String[] args) throws ParseException {
		
		String inputMonthDate = "1105";
		String inputHHMMSS = "130635";
		
//		int year = (new Date().getYear())+1900;
//		String inputmonth = inputMonthDate.substring(0, inputMonthDate.length()-2);
//		String inputDate = inputMonthDate.substring(inputMonthDate.length()-2);
//		String inputHH = inputHHMMSS.substring(0, inputHHMMSS.length()-4);
//		String inputMM = inputHHMMSS.substring(inputHHMMSS.length()-4, inputHHMMSS.length()-2);
//		String inputSS = inputHHMMSS.substring(inputHHMMSS.length()-2);
		
//		System.out.println(inputmonth);
//		System.out.println(Integer.valueOf(inputDate));
//		System.out.println(inputHH);
//		System.out.println(Integer.valueOf(inputMM));
//		System.out.println(inputSS);
		
//		String FinalDate = String.valueOf(year)+"-"+inputmonth+"-"+inputDate+" "+inputHH+":"+inputMM+":"+inputSS;
		
		String FinalDate = String.valueOf(Year.now().getValue())+"-"
				+inputMonthDate.substring(0, inputMonthDate.length()-2)+"-"
				+inputMonthDate.substring(inputMonthDate.length()-2)+" "
				+inputHHMMSS.substring(0, inputHHMMSS.length()-4)+":"
				+inputHHMMSS.substring(inputHHMMSS.length()-4, inputHHMMSS.length()-2)+":"
				+inputHHMMSS.substring(inputHHMMSS.length()-2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf.parse(FinalDate);
		System.out.println(parse);
		
		int yearn = Calendar.getInstance().get(Calendar.YEAR);
		int yearm = Year.now().getValue();
		System.out.println(yearn + " ::"+yearm);
		System.out.println(yearn + " ::"+yearm);
		
//		void java.util.Calendar.set(int year, int month, int date, int hourOfDay, int minute, int second)
		Calendar cal = Calendar.getInstance();
//		cal.set(1, yearm);
//		Date time = cal.getTime();
		
//		Date d=new Date(1911,8,12);  	
//		d.setSeconds(0);
//		Date d = Date.parse("");
		
//		int i = Instant.now().get(ChronoField.YEAR_OF_ERA);
//		System.out.println(i);
		
		try {

			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			String dateStr = "08/09/2023 09:20 PM";
//			LocalDateTime parse = LocalDateTime.parse(dateStr.trim(), dateTimeFormatter);
//			System.out.println("parse LocalDateTime = "+parse);
			
//		    Map<Long, String> ampmStrings = Map.of(0L, "a", 1L, "p");
		    final Map<Long, String> ampmStrings = new HashMap<>();
		    ampmStrings.put(0L, "AM");
		    ampmStrings.put(1L, "PM");
		    DateTimeFormatter dateTimeFormatter2 = new DateTimeFormatterBuilder()
		            .appendPattern("dd/MM/yyyy hh:mm ")
		            .appendText(ChronoField.AMPM_OF_DAY, ampmStrings)
		            .toFormatter();
		    
		    LocalDateTime time = LocalDateTime.parse(dateStr, dateTimeFormatter2);
		    System.out.println("Parsed time: " + time);
		    
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=============================");
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date parse2 = sdf2.parse(sdf2.format(new Date()));
		System.out.println(" test" + parse2);
		
		
	}
	
	
	public void getJulianDate() {
		
		SimpleDateFormat yearFormat = new SimpleDateFormat("y");
		SimpleDateFormat julianFormat = new SimpleDateFormat("DDD");
		Date today = new Date();
		String year = yearFormat.format(today);
		year = year.substring(year.length() - 1);
		String julianDate = julianFormat.format(today);
		
		System.out.println("test2" + julianDate);
	}
	
	public void changeDate2() {
//		LocalDateTime localDate = LocalDateTime.now();
		String date = "2024-03-03 18:40:00.000000000";
		 date = date.substring(0, 16);
		 DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		 LocalDateTime localDate = LocalDateTime.parse(date,dtf1);
		 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
		String format = localDate.format(dtf);
		
		System.out.println(format);
	}
	
	

}
