import java.util.*;

class Heartratesdriver {

	public static void main(String args[])

	{ Scanner input = new Scanner(System.in);

	 Heartrates myheartrate[]=new Heartrates[2];

	 for(int count=0;count<(myheartrate.length);count++)

	 {

	 System.out.println("Enter first Name :");

	 String firstname = input.nextLine();

	 System.out.println("Enter last Name :");

	 String lastname = input.nextLine();

	 System.out.println("Enter Birthdate:"+"\nmm"+"\ndd"+"\nyear");

	 int month = input.nextInt();

	 int day = input.nextInt();

	 int year = input.nextInt();

	 input.nextLine();

	 myheartrate[count]= new Heartrates(firstname,lastname,month,day,year);

	 System.out.println("firstname"+"\t"+"lastname"+"\t"+"\t"+"Age in years"+"\t"+"maximumheartrate"+"\t"+"targetheartrate");

	  System.out.println(firstname+"\t"+lastname+"\t"+myheartrate[count].getage()+"\t"+myheartrate[count].maximumheartrate()); 

	  myheartrate[count].targetheartrate();

	 }}

}