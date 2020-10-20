package date;


public class Date {

	private double seconds;
	private double minutes;
	private double time;
	private double day;
	private double month;
	private double year;

	public Date() {

	}

	public Date(int secondsValue, int minutesValue, int timeValue, int dayValue, int monthValue, int yearValue) {
		seconds = secondsValue;
		minutes = minutesValue;
		time = timeValue;
		day = dayValue;
		month = monthValue;
		year = yearValue;
		// dava stoinost na vsi4ki poleta
	}
	
	
	public double getSeconds() {

		return seconds;

	}

	public double getMinutes() {

		return minutes;

	}

	public double getTime() {

		return time;

	}

	public double getMonth() {

		return month;

	}

	public double getYear() {

		return year;

	}

	public double getDay() {

		return day;

	}

	public double setSeconds(double secondsValue) {

		seconds = secondsValue;
		return secondsValue;

	}

	public double setMinutes(double minutesValue) {

		minutes = minutesValue;
		return minutesValue;

	}

	public double setTime(double timeValue) {
		time = timeValue;
		return timeValue;

	}

	public double setMonth(double monthValue) {
		month = monthValue;
		return monthValue;

	}

	public double setYear(double yearValue) {

		year = yearValue;
		return yearValue;

	}

	public double setDay(double dayValue) {

		day = dayValue;
		return dayValue;

	}

	public Date(double secondsValue, double minutesValue, double timeValue, double dayValue, double monthValue,
			double yearValue) {

		seconds = seconds + 1;
		minutes = minutesValue;
		time = timeValue;
		day = dayValue;
		month = monthValue;
		year = yearValue;

	}

	public double comapreTo(Date d) {

		if (year > d.getYear()) {
			return -1;
		} else if (year < d.getYear()) {
			return (1);
		} else {
			if (month > d.getMonth()) {
				return (-1);
			}

			else if (month < d.getMonth()) {
				return (1);
			} else {
				if (day > d.getDay()) {
					return (-1);
				} else if (day < d.getDay()) {
					return (1);
				} else {
					if (time > d.getTime()) {
						return (-1);
					}

					else if (time < d.getTime()) {
						return (1);
					} else {
						if (minutes > d.getMinutes()) {
							return (-1);
						} else if (minutes > d.getMinutes()) {
							return (1);
						} else {
							if (seconds > d.getSeconds()) {
								return (-1);
							} else if (seconds < d.getSeconds()) {
								return (1);
							} else {
								return (0);
							}
						}
					}
				}
			}
		}
	}

	public int leapYear() {
		int check = 0;
		if (year % 4 != 0) {
			check++;
		}

		else if (year % 100 != 0) {
			return (check);
		} else if (year % 400 != 0) {
			check++;
		} else {
			return (check);
		}
		return (check);
	}

	public int checkDate(Date d) {
		int sum = 0;
		int i = 0;
		while (d.getMonth() - 1 > i) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
				sum += 31;
			} else if (i == 1) {
				if (d.leapYear() == 0) {
					sum += 29;
				} else
					sum += 28;

			} else
				sum += 30;
			i++;
		}
		sum += d.getDay();

		return (sum);
	}

	public int checkWeek(Date d) {
		int week = 0;
		week = checkDate(d) / 7 + 1;
		return (week);
	}

	public void addSecond(Date d) {
		d.setSeconds(d.getSeconds() + 1);
		if (d.getSeconds() >= 60) {
			d.setSeconds(d.getSeconds() - 60);
			d.setMinutes(d.getMinutes() + 1);
			if (d.getMinutes() >= 60) {
				d.setMinutes(d.getMinutes() - 60);
				d.setTime(d.getTime() + 1);
				if (d.getTime() >= 24) {
					d.setTime(d.getTime() - 24);
					d.setDay(d.getDay() + 1);
					if (d.getDay() > 28 && d.getMonth() == 2 && d.leapYear() == 1) {
						d.setDay(d.getDay() - 28);
						d.setMonth(d.getMonth() + 1);
						if (d.getMonth() >= 12) {
							d.setMonth(d.getMonth() - 12);
							d.setYear(d.getYear() + 1);
						}
					} 
					else if (d.getDay() > 29 && d.getMonth() == 2 && d.leapYear() == 0) {
						d.setDay(d.getDay() - 29);
						d.setMonth(d.getMonth() + 1);
						if (d.getMonth() >= 12) {
							d.setMonth(d.getMonth() - 12);
							d.setYear(d.getYear() + 1);
						}
					} 
					else if (d.getMonth() > 30
							&& (d.getMonth() == 4 || d.getMonth() == 6 || d.getMonth() == 9 || d.getMonth() == 11)) {
						d.setDay(d.getDay() - 30);
						d.setMonth(d.getMonth() + 1);
						if (d.getMonth() >= 12) {
							d.setMonth(d.getMonth() - 12);
							d.setYear(d.getYear() + 1);
						}
					} 
					else if (d.getDay() > 31) {
						d.setDay(d.getDay() - 31);
						d.setMonth(d.getMonth() + 1);
						if (d.getMonth() >= 12) {
							d.setMonth(d.getMonth() - 12);
							d.setYear(d.getYear() + 1);
						}
					}
				}
			}
		}
		System.out.println(d.getSeconds() + ":" + d.getMinutes() + ":" + d.getTime() + " " + d.getDay() + ":"
				+ d.getMonth() + ":" + d.getYear());
	}


}
