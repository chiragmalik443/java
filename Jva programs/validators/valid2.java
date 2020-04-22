class NameValidator{
	boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: "+filename+" and its type is:"+filetype);
		boolean b;
		b=emptyFileName(filename);
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
}
	



class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("","csv");
		System.out.println(checkValidator);
	}
}
