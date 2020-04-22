class Project
{	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities;
	Project()
	{
		name = "";
		startDate =null;
		endDate =null;
		role = "";
		responsibilities= null;
	}
	Project(String name,Date startDate,Date endDate,String role,String [] responsibilities)
	{
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.role = role;
		this.responsibilities = responsibilities;
	}
	void display()
	{
	}

}