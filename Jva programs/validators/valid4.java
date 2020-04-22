import java.util.regex.Pattern;
import java.util.regex.Matcher;
class NameValidator{
	boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: "+filename+" and its type is:"+filetype);
		boolean b;
		b=emptyFileName(filename);
		if (b==true)
			return false;
		b=missingDot(filename);
		if (b==true)
			return false;
		b=fileFormat(filename);
		if (b==true)
			return false;

		return true;
	}
	boolean emptyFileName(String filename){
		if (filename==""){
			return true;
		}
		else{
			return false;
		}
	}
	boolean missingDot(String fileName){
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(fileName);
		boolean value = costMatcher.find();
		if (value==true){
			return false;
		}
		else{
			return true;
		}
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
}
	



class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("example.","csv");
		System.out.println(checkValidator);
	}
}
