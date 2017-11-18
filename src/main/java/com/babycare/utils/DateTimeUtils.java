package com.babycare.utils;

import org.joda.time.DateTime;

public class DateTimeUtils {
	public static int getWeekDiffFromNow(Long timeInMS) {
		return DateTime.now().weekOfWeekyear().get() - new DateTime(timeInMS).weekOfWeekyear().get();
	}
}
