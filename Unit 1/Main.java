import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		for(int i = 0; i < numTests; i++){
			int date = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
		    MyCalendar calendar = new MyCalendar(date, month, year);
		    calendar.setDate();
			String dayWeek = calendar.getDay();
			System.out.println(dayWeek);
		}
		scan.close();
	}
}

class MyCalendar {
	public MyCalendar(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(){
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
	}
	
	public String getDay(){
		int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(dayWeek == Calendar.SUNDAY)
			return "Sunday";
		else if(dayWeek == Calendar.MONDAY)
			return "Monday";
		else if(dayWeek == Calendar.TUESDAY)
			return "Tuesday";
		else if(dayWeek == Calendar.WEDNESDAY)
			return "Wednesday";
		else if(dayWeek == Calendar.THURSDAY)
			return "Thursday";
		else if(dayWeek == Calendar.FRIDAY)
			return "Friday";
		else
			return " Saturday";
	}
	
private int date;
private int month;
private int year;
private Calendar calendar = new GregorianCalendar();
}
