package people;
import java.util.Scanner;
public class Date  
{
	
	public String toString() {
		return "" + this.getDay() + "/" + this.getMonth() + "/" + this.getYear() ;
	}

	private int day;
	private int month;
	private int year;
	
	public int setDay(int day ) {
		if(day<1||day>this.maxDay())
			return this.day=0;
		else return this.day=day;
	}
	public int setMonth(int month ) {
		if(month<1||month>12)
			return this.month=0;
		else return  this.month=month;
	}
	public int setYear(int year ) {
		if(year<1900||year>2021) return this.year=0;
		else return this.year=year;
	}
	
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	
	// contructer
	
	
	public Date(){
		this.day=1;
		this.month=1;
		this.year=2021;
	}
	public Date(int d, int m, int y){
		this.setDay(d);
		this.setMonth(m);
		this.setYear(y);
	}
	
	
	public int maxDay()
	{
		if(this.month== 1|| this.month==3|| this.month==5|| this.month ==7|| this.month== 8||
				this.month==10||this.month ==12)
		{
			return 31;
		}
		else
		{
			if(this.month== 4|| this.month ==6|| this.month==9||this.month ==11)
			{
				return 30;
			}
			else
			{
				if(this.year%400==0||(this.year%4==0&&this.year%100!=0))
				{
					return 29;
				}
				else
				{
					return 28;
				}
			}
		}
	}
	
	public int input(String d, int begin, int end)
	{
		int x;
		do
		{
			Scanner kb= new Scanner (System.in);
			System.out.println("Enter "+d+": ");
			x =kb.nextInt();
		}while(x <begin|| x >end);
		return x;
	}
	public void input()
	{
		
		this.year= input("year",1920,2021);
		this.setYear(year);
		this.month= input("month",1,12);
		this.setMonth(month);
		this.day=input("day",1,maxDay());
		this.setDay(day);
		
		
		
	}
	public void output()
	{
		
		System.out.println(+this.getDay()+" "+this.getMonth()+" "+this.getYear());
		
		
		
	}
	public void nextDay()
	{
		if(this.getDay()==maxDay())
		{
			if(this.getMonth()==12)
			{
				System.out.println("1/1/"+(this.getYear()+1));
			}
			else
			{
				System.out.println("1/"+(this.getMonth()+1)+"/"+this.getYear());
			}
		}
		else
		{
			System.out.println((this.getDay()+1)+"/"+this.getMonth()+"/"+this.getYear());
		}
		
	}
	
	public static void main(String[] args) 
	{
		Date d1= new Date(13,02,2000);
		d1.input();
		d1.nextDay();
		
		Date d2= new Date(13,02,2000);
		d2.input();
		d2.nextDay();
	}

}
