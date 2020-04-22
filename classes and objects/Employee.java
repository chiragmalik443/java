class Employee{

	String name;

	int yearJoining;

	double salary;

	String address;

	Employee(){

		name= " ";

		yearJoining=0;

		salary=0;

		address=" ";

	} 	

	Employee(String name,int yearJoining,int salary,String address)

	{

		this.name=name;

		this.yearJoining=yearJoining;

		this.salary=salary;

		this.address=address;

	}

	void Display(){

		System.out.println( (name) + "\t" + (yearJoining) "\t" + (address));

	}

}