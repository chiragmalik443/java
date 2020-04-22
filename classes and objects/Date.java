import java.util.*; 

class Date {

	int month;

	int day;

	int year;

	Date(int month,int day,int year)

	{ this.month=month;

	this.day=day;

	this.year=year;}

	void setmonth(int month)

	{if(month>=1 && month<=12)

	{this.month=month;}

	else {

	System.out.println("Invalid Month");}

	}

	int getmonth()

	{return month;}

	void setday(int day)

	{if(day>=1 && day<=31)

	this.day=day;

	else

	System.out.println("Invalid Day");}

	int getday()

	{return day;}

	void setyear(int year)

	{if(year>=1900 && year<=2100)

	this.year=year;}

	int getyear()

	{return year;}

	void displayDate()

	{System.out.printf("%d/%d/%d\n",getmonth(),getday(),getyear());}
