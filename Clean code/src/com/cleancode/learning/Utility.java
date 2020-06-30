package com.cleancode.learning;

import java.time.Duration;
import java.util.Calendar;

public class Utility {
	
	public static int getLastDateOfCurrentMonth() {
		Calendar cal = Calendar.getInstance();
	      int res = cal.getActualMaximum(Calendar.DATE);
	      System.out.println("last date of current month:"+ res);
	      return res;
	}

	public static int countWeekendDays(int year, int month) {
	    Calendar calendar = Calendar.getInstance();
	  
	    // Note that month is 0-based in calendar, bizarrely.
	    calendar.set(year, month - 1, 1);
	    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	    int count = 0;
	    for (int day = 1; day <= daysInMonth; day++) {
	        calendar.set(year, month - 1, day);
	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static long totalNumberOfWorkingMinutesInMonthandYear(){
		int lastDateOfCurrentMonth = getLastDateOfCurrentMonth();
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int countWeekendDays = countWeekendDays(year,month);
		int totalworkingmiutes=((lastDateOfCurrentMonth*240) - (countWeekendDays*240));
		System.out.println("totalworkingmiutes:"+totalworkingmiutes);
		return totalworkingmiutes;
		
	}
	
	
	public static long calculateWokingHours(long totalNumberOfWorkingMinutesInMonthandYear) {
		Duration d = Duration.ofMinutes( totalNumberOfWorkingMinutesInMonthandYear );
		long hours = d.toHours();
		System.out.println("hours :"+hours);
		return hours;
	}
}
