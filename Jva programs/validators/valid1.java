class NameValidator{
	boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: "+filename+" and its type is:"+filetype);
		return true;
	}
}

class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		//csvObject.nameValidator("example.csv","csv");
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
	}
}
