package january12;

public class Student {
	
	String name;
	int id;
	String collegeName;
	String department;
	
	
	Student(String iname, int iid, String iCollege, String idepartment){
		name = iname;
		id = iid;
		collegeName = iCollege;
		department = idepartment;
	}
	
	Student(String iName, int iid, String iDepartment){
		
		name = iName;
		id = iid;
		department = iDepartment;
		collegeName = "Dhole Patil";
	}
	
	
	
	void attendsLecture() {
		System.out.println( name + " attends lecture");
	}
	
	void appearsForExam() {
		System.out.println(name + " attends exam with id " + id);
		
	}
	
	void studiesInDepartment() {
		System.out.println(name + "studies in department " + department);
	}
	
	void goesToCollege() {
		System.out.println(name + " goes to college: " + collegeName);
	}
	
	
	String returnName() {
		name = "Radical";
		return name;
	}
	
	int returnId() {
		
		return id;
	}
	
	
}
