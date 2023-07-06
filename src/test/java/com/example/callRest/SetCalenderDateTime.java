package com.example.callRest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

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
		
		
		
		
	}

	
	

}
