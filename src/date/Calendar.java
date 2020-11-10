package date;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar {

	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setBounds(100, 100, 900, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setBounds(10 , 10 , 100 , 50);
		window.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setBounds(120 , 10 , 100 , 50);
		window.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setBounds(230 , 10 , 100 , 50);
		window.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setBounds(340 , 10 , 100 , 50);
		window.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setBounds(450 , 10 , 100 , 50);
		window.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setBounds(560 , 10 , 100 , 50);
		window.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setBounds(670 , 10 , 100 , 50);
		window.add(lblSunday);
		
		 JPanel[] panelDays = new JPanel[42];
		    int i = 0;
		    int x = 0;
		    int y = 100;
		    int count = 0;
		    while(i != 6) 
		    {
		    	panelDays[i] = new JPanel();
		    	panelDays[i].setBounds(x, y, 75, 75);
		    	panelDays[i].setBackground(Color.blue);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.blue);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.blue);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.blue);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.blue);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.red);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    i = 0;
		    x += 100;
		    y = 100;
		    
		    while(i != 6) 
		    {
		    	panelDays[count + i] = new JPanel();
		    	panelDays[count + i].setBounds(x, y, 75, 75);
		    	panelDays[count + i].setBackground(Color.red);
		    	panelDays[count + i].setVisible(true);
		    	window.add(panelDays[count + i]);
		    	y += 100;
		    	i++;
		    	if(i == 6) 
		    	{
		    		count += i;
		    	}
		    }
		    
		    window.setVisible(true);
	}

}
