class student
{
	String firstname;
	String lastname;
	Address addr;
	Date dob;
	String [] skills;
	Qualification [] qual;
	Project [] projects;
	String email;
	String contactNo;
	student()
	{
		firstname ="";
		lastname = "";
		addr ="";
		skills= null;
		qual = null;
		projects= null;
		email = "";
		contactNo = ""; 
		dob = null;
	}
	student(String firstname,String lastname,Address addr,Date dob,String skills[],Qualification qual[],Project projects[],String email,String contactNo)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.addr = addr;
		this.dob = dob;
		this.skills = skills;
		this.qual = qual;
		this.projects = projects;
		this.email = email;
		this.contactNo = contactNo; 
	}
	void display()
	{

	}
}