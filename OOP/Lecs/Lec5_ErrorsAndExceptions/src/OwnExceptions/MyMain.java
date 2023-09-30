package OwnExceptions;

public class MyMain {

	public static void main(String[] args)throws InvalidStudentIDException {

		//getting student ID
		String sid = "d22894656";
		
		if(!sid.startsWith("IT")) {
			throw new InvalidStudentIDException("Invalid ID - Must start with \"IT\""); 
		
		}
		

	}

}

/*
you need to create your own exception class
and it should extends the Exception class and 
include default constructor

1)you have to write condition Where you detect the exception
2)create the object by passing suitable msg
3)throw it

*/