import java.util.*;

class EmployeeTest{

	public static void main(String args[]){

		Employee e1();

		Scanner in=new Scanner(System.in);

		int numberofemployees;

		int i;

		System.out.println("Enter the number of Employee");

		numberofemployees=in.nextInt();

		e1=new Employee[numberofemployees];

		for(i=0;i<numberofemployees;i++){

			System.out.println("Enter employee details of employee");

			e1[i].name=in.nextLine();

			e1[i].yearJoining=in.nextInt();

			e1[i].salary=in.nextDouble();

			e1[i].address=in.nextLine();

		}

		for(i=0;i<numberofemployees;i++){

			e1(i).Display();

		}

	}

}