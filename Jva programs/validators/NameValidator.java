package com.ncu.validators;
import com.ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class NameValidator{
	public boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: "+filename+" and its type is:"+filetype);
		boolean b;
		Properties prop = new Properties();
		FileInputStream input=null; 
		Logger logger = Logger.getLogger(NameValidator.class);
		PropertyConfigurator.configure("/home/sandeep/Documents/java_prg/guidedprj/configs/logger/logger.properties");
		try{	
			input = new FileInputStream("/home/sandeep/Documents/java_prg/guidedprj/configs/constants/exceptions.properties");
			prop.load(input);
			emptyFileName(filename);
			missingDot(filename);
		}
		catch(EmptyFileNameException e){
			logger.error("\n \n"+e+prop.getProperty("emptyNameMessage")+"\n");
			return false;
		}
		catch(MissingExtensionException e){
			logger.error("\n \n"+e+prop.getProperty("extensionMessage")+"\n");
			return false;
		}
		catch(Exception e){
			System.out.println(e);
		}
		b=fileFormat(filename);
		if (b==true)
			return false;
		b=fileLength(filename);
		if (b==true)
			return false;
		b=specialCharacter(filename);
		if (b==true)
			return false;
		if(filetype=="csv"){
			b=csvOnly(filename);
			if (b==true)
				return false;
		}
		else{
			b=jsonOnly(filename);
			if (b==true)
				return false;
		}
		if(filetype=="csv"){
			b=fileNotAvailable(filename);
			if (b==true)
				return false;
		}
		else{
			b=fileExist(filename);
			if (b==true)
				return false;
		}
		return true;
	}
	private void emptyFileName(String filename)throws EmptyFileNameException{
		if (filename=="")
			throw new EmptyFileNameException("Empty File Name Exception");
	}
	private void missingDot(String fileName)throws MissingExtensionException{
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(fileName);
		boolean value = costMatcher.find();
		if (value==true)
			throw new MissingExtensionException("Missing Extension Exception");
	}
	boolean fileFormat(String fileName) {
		String [] extn = fileName.split("\\.");
		if (extn.length<=1) {
			return true;
		}
		else{ 
			return false;
		}
	}
	boolean fileLength(String fileName){
		int fileLength=25;
		String namelength = fileName.split("\\.")[0];
		if(namelength.length()>fileLength)
			return true;
		else 
			return false;
	}
	boolean specialCharacter(String fileName){
		fileName = fileName.split("\\.")[0];
		Pattern  patternGet = Pattern.compile("[@#$%^&(,)_]");
		Matcher check = patternGet.matcher(fileName);
		boolean finalValue = check.find();
		if (finalValue == true)
			return true;
		else
			return false;
	}
	boolean csvOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		//now name[0] contains the filename and name[1] contains the extension
		if(name[1].equals("csv")==true)
			return false;
		else
			return true;
	}
	boolean jsonOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		if(name[1].equals("json")==true)
			return false;
		else
			return true;
	}
	boolean fileNotAvailable(String fileName){
		File f = new File(fileName);
		if(f.exists()==true)
			return false;
		else
			return true;
	}
	boolean fileExist(String fileName){
		File f = new File("./"+fileName);
		if(f.exists()==true)
			return true;
		else
			return false;
	}
}
	


class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("","json");
		System.out.println(checkValidator);
	}
}
