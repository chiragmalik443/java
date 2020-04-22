import java.io.*;
import java.util.*;
class FileSearch
{
	public static void main(String args[])
	{
	try{
	File f=new File("file1.txt");
	FileReader fin=new FileReader(f);
	BufferedReader bin=new BufferedReader(fin);
	String search;
	System.out.print("enter the word to search: ");
	Scanner sc=new Scanner(System.in);
	search=sc.next();
	String sr;
	boolean flag=false;
	System.out.print("The conents of the files are: ");
	while((sr=bin.readLine())!=null)
	{
	System.out.print(sr);
	String[] strs=sr.split(" ");
	for(int i=0;i<strs.length;i++)
	{
	if(strs[i].equals(search))
	{
	flag=true;
	break;
	}
	}
	}
	if((sr=bin.readLine())==null && flag==false)
	{
	System.out.print("\n not present");
	}
	else
	{
	System.out.print("\n present");
	}
	}
	catch (Exception e)
	{
	 e.printStackTrace();
	}
	}
}