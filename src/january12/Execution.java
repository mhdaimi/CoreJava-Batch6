package january12;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		Student amol = new Student("Amol", 123, "COEP", "Mechanical");
		amol.attendsLecture();
		amol.goesToCollege();
		*/
	
		
		Student rashmi = new Student("Rashmi", 333, "Electrical");
		
		rashmi.goesToCollege();
		rashmi.appearsForExam();
		rashmi.attendsLecture();
		
		String result = rashmi.returnName();
		System.out.println(result);
		
		int id = rashmi.returnId();
		System.out.println(id);
			
	}

}
