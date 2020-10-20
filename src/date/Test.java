package date;

import java.util.Scanner;


public class Test {

public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int temp = scan.nextInt();
		Date d = new Date ();
		d.setSeconds(temp);
		temp = scan.nextInt();
		d.setMinutes(temp);
		temp = scan.nextInt();
		d.setTime(temp);
		temp = scan.nextInt();
		d.setDay(temp);
		temp = scan.nextInt();
		d.setMonth(temp);
		temp = scan.nextInt();
		d.setYear(temp);
		temp = scan.nextInt();
		Date d2 = new Date ();
		d2.setSeconds(temp);
		temp = scan.nextInt();
		d2.setMinutes(temp);
		temp = scan.nextInt();
		d2.setTime(temp);
		temp = scan.nextInt();
		d2.setDay(temp);
		temp = scan.nextInt();
		d2.setMonth(temp);
		temp = scan.nextInt();
		d2.setYear(temp);
		System.out.println(d.comapreTo(d2));
		if(d.leapYear()==0) 
		{
			System.out.println("Leap year");
		}
		else System.out.println("Common year");
		if(d2.leapYear()==0) 
		{
			System.out.println("Leap year");
		}
		else System.out.println("Common year");
		System.out.println(d.checkDate(d));
		System.out.println(d.checkWeek(d));
		d.addSecond(d);
		int n = scan.nextInt();
		Date [] ds = new Date [n] ;
		for (int i = 0; i < n; i++) 
		{
			ds[i]= new Date ();
			temp=scan.nextInt();
			ds[i].setSeconds(temp);
			temp = scan.nextInt();
			ds[i].setMinutes(temp);
			temp = scan.nextInt();
			ds[i].setTime(temp);
			temp = scan.nextInt();
			ds[i].setDay(temp);
			temp = scan.nextInt();
			ds[i].setMonth(temp);
			temp = scan.nextInt();
			ds[i].setYear(temp);
		}
		sortDate(ds);
		for (int i = 0; i < n; i++) 
		{
			System.out.println(ds[i].getSeconds() + ":" + ds[i].getMinutes() + ":" + ds[i].getTime() + " " + ds[i].getDay() + ":" + ds[i].getMonth( ) + ":" + ds[i].getYear());
		}
		scan.close();

	}
	
	public static void sortDate(Date [] d1) 
	{
		Date temp;
		for (int i = 0; i <d1.length-1;i++) 
		{
			for (int j = 1; j <d1.length;j++) 
			{
				if(d1[i].comapreTo(d1[j])==-1) 
				{
					temp = d1[i];
					d1[i] = d1[j];
					d1[j]=temp;
				}
			}
		}
	}

}
