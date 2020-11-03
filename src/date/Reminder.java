package date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder {
	
	private Event[] events;
	private int number;
	
	public Reminder()
	{
		events = new Event [30];
		number = 0 ;
	}
	
	public void addEvent(Event newEvent)
	{
		if(newEvent == null)
		{
			System.out.println("There are 0 events");
		}
		
		if(number >= 30)
		{
			System.out.println("The array of events is full");
		}
		
		events[number] = newEvent;
		number++;
			
	}
	
	public Event[] getAllEvents(Date date)
	{
		Event[] currentDateEvents = new Event[30];
		Date currentDate;
		for(int i = 0;i < 3;i++) 
		{
			//currentDateEvents[i] = new Event();
			currentDate = events[i].getDate();
			
			if(date.IsSameDate(currentDate) == true) 
			{
				currentDateEvents[i] = events[i];
				
			}
		}
		return currentDateEvents;
	}
	
	
	public void remind()
	{
		LocalDate currentLocalDate=LocalDate.now();
		  
		Date currentDate = new Date();
		
		int currentDay = currentLocalDate.getDayOfMonth();
		int currentMonth = currentLocalDate.getMonthValue();
		int currentYear = currentLocalDate.getYear();
		
		currentDate.setDay(currentDay);
		currentDate.setMonth(currentMonth);
		currentDate.setYear(currentYear);
		
		Event[] eventsOfCurrentDate = new Event[30];
		eventsOfCurrentDate = getAllEvents(currentDate);
		
		for(int i = 0;i < eventsOfCurrentDate.length;i++) 
		{
			if(eventsOfCurrentDate[i] != null) 
			{
				System.out.println(eventsOfCurrentDate[i].toString());
			}
		}
	}

}
