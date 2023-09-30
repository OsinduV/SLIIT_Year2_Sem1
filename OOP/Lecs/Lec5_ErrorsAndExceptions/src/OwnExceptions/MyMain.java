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
