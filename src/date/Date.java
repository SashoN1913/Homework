package date;


public class Date {

	private double seconds;
	private int minutes;
	private int time;
	private int day;
	private int month;
	private int year;

	private DayOfWeek dayOfWeek;
	
	
	public Date() {
		seconds = 0;
		minutes = 0;
		time = 0;
		day = 0;
		month = 0;
		year = 0;
		
	}
	
	public Date(DayOfWeek dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}

	public Date(int dayOfWeek)
	{
		this.dayOfWeek = DayOfWeek.getDay(dayOfWeek - 1);
	}
	
	public void setDayOfWeek(DayOfWeek dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}
	
	public DayOfWeek getDayOfWeek()
	{
		return this.dayOfWeek;
	}
	
	public DayOfWeek whichDayOfWeek()
	{
		int[] f = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
		this.year -= this.month < 3 ? this.month : 0;
		return DayOfWeek.getDay(((this.year + this.year/4 - this.year/100 + this.year/400 + f[this.month-1] + this.day) % 7) - 1);
	}
	
	public Date(double secondsValue, int minutesValue, int timeValue, int dayValue, int monthValue, int yearValue) {
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

	public int getMinutes() {

		return minutes;

	}

	public int getTime() {

		return time;

	}

	public int getMonth() {

		return month;

	}

	public int getYear() {

		return year;

	}

	public int getDay() {

		return day;

	}

	public void setSeconds(double secondsValue) 
	{
		seconds = secondsValue;
	}

	public void setMinutes(int minutesValue) 
	{
		minutes = minutesValue;	
	}

	public void setTime(int timeValue) 
	{
		time = timeValue;
	}

	public void setMonth(int monthValue) 
	{
		month = monthValue;
	}

	public void setYear(int yearValue) 
	{
		year = yearValue;
	}

	public void setDay(int dayValue) 
	{
		day = dayValue;
	}

	public Date(int secondsValue, int minutesValue, int timeValue, int dayValue, int monthValue,
			int yearValue) {

		seconds = seconds + 1;
		minutes = minutesValue;
		time = timeValue;
		day = dayValue;
		month = monthValue;
		year = yearValue;

	}

	public int comapreTo(Date d) {

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
				+ d.getMonth() + ":" + d.getYear() + " " + whichDayOfWeek());
	}

	public String ToString()
	{
		return time + ":" + minutes + ":" + seconds + " of " + day + "." + month + "." + year + ", " + whichDayOfWeek();  
	}
	
}
