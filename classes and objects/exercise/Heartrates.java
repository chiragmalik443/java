public class Heartrates{

	String firstname,lastname;

	dob d;

	public Heartrates(String fname,String lname,int mon,int da,int ye)

	{ firstname=fname;

	lastname=lname;

	d=new dob();

	d.setdob(da,mon,ye);}

	public void setfirstname(String fname)

	{ firstname=fname;

	}

	public String getfirstname()

	{return firstname;}

	public void setlastname(String lname)

	{ lastname=lname;

	}

	public String getlastname()

	{return lastname;}

	public int getage()

	{ return(2019-d.year);}

	public int maximumheartrate()

	{return 220-getage();}

	public void targetheartrate()

	{System.out.print("target heart rate range:"+maximumheartrate()*0.5+" to " +maximumheartrate()*0.85);}

	}