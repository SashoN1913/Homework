package date;

public enum DayOfWeek {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	
	private int dayOfWeek;
	
	
	public String toString()
	{
		return this.name();
	}
	
	
	public static DayOfWeek getDay(int dayOfWeekValue)
	{
		switch(dayOfWeekValue)
		{
		case(1):
		{
			return MONDAY;
		}
		case(2):
		{
			return TUESDAY;
		}
		case(3):
		{
			return WEDNESDAY;
		}
		case(4):
		{
			return THURSDAY;
		}
		case(5):
		{
			return FRIDAY;
		}
		case(6):
		{
			return SATURDAY;
		}
		
		}
		
		return SUNDAY;
	}
	
	public String toString(int numberOfLetters)
	{
		if(this.name().length() < numberOfLetters || numberOfLetters < 0)
		{
			return "Not valid.";
		}
		
		String result = "";
		for(int i = 0;i < numberOfLetters;i ++)
			result += this.name().valueOf(this.name().charAt(i));
		return result;
		
	}
	
	
	
	
	
	
}
