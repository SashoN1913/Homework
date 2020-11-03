package date;

public class Event 
{
	private String name;
	private Date date ;
	
	public Event()
	{
		name = " ";
		date.setDay(1);
		date.setMinutes(0);
		date.setMonth(1);
		date.setSeconds(0);
		date.setTime(0);
		date.setYear(1);
		
	}
	
	public Event(Date date , String name)
	{
		if(!name.isEmpty())
		{
			this.name = name;
		}
		this.date = date;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Date getDate()
	{
		return date;
		
	}
	
	public String toString()
	{
		return date.getDay() + "." + date.getMonth() + "." + date.getYear() + "," + date.getTime()+ ":" + date.getMinutes() +  " - " + name;
	}
	

}
