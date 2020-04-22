import java.util.*;
class StudentDriver{
	public static void main(String[] args) {
 	student s1 = new student();
	Scanner in = new Scanner(System.in);
        System.out.println("Enter the details of student");
	System.out.println("First Name : ");
	String firstName = in.nextLine();
        System.out.println("Last Name :");
        String lastName = in.nextLine();
        System.out.println("email :");
        String email = in.nextLine();
       	System.out.println("contactNo : :");
        String contactNo = in.nextLine();
        System.out.println("enter the no. of skills");
       	int a =in.nextInt();
        String skills[] = new String[a];
        for(int i=0;i<a;i++)
        	{
              	skills[i] = in.nextLine();
            } 
	System.out.println("Address line1 :");
        String line1 = in.nextLine();


	System.out.println("Address line2 :");
        String line2 = in.nextLine();


	System.out.println("Address city :");
       	String city = in.nextLine();


	System.out.println("Address state :");
       	String state = in.nextLine();


	System.out.println("pinCode : ");
       	int pinCode = in.nextInt();

  	Address addr = new Address(line1,line2,city,state,pinCode);

	System.out.println("Enter the no. of Qualifications");
	int b = in.nextInt();
	Qualification qual[] = new Qualification[b];
	for(int i =0 ; i<b;i++)
		{
		System.out.println("Qualification - Qualification name :");
                String qualName = in.nextLine();
                System.out.println("Qualification - university :");
                String university = in.nextLine();
              	System.out.println("Qualification - institute :");
             	String institute = in.nextLine();

           	System.out.println("Qualification - cgpa :");
           	float cgpa = in.nextFloat();
                qual[i] = new Qualification(qualName,university,institute,cgpa);
        	}

		System.out.println("enter the no. of projects");
		int c = in.nextInt();
		Project project[] = new Project[c]; 
		for (int i =0 ;i<c  ;i++ ) 
		{
		System.out.println("Project - Name : ");
                String name = in.nextLine();

                System.out.println("Project - startDate : ");
         	String startDate = in.nextLine();


       		System.out.println("Project - endDate : ");
         	String endDate = in.nextLine();


     		System.out.println("Project - role : ");
       		String role  = in.nextLine();


   		System.out.println("how many resposibilities you want to enter");
      		int n = in.nextInt();

              	String  responsibilities[] = new String[n];
           	for(i=0;i<n;++i)
        		{
                    responsibilities[i] = in.nextLine();
                }
            project[i] = new Project( name , startDate , endDate ,  role, responsibilities);
        }
    	student s2 = new student(firstName,lastName,qual,addr,project,email, contactNo,skills);
	}
}