package january19;

public class SwitchExample {

	public static void main(String[] args) {
		String day = "Wednesday";
		
		//int day = 1;
		
		switch(day) {
		case "Sunday" : System.out.println("Day 1 of the week");
		break;
		case "Monday" : System.out.println("Day 2 of the week");
		break;
		case "Tuesday" : System.out.println("Day 3 of the week");
		break;
		case "Wednesday" : System.out.println("Day 4 of the week");
		break;
		case "Thursday" : System.out.println("Day 5 of the week");
		break;
		case "Friday" : System.out.println("Day 6 of the week");
		break;
		case "Saturday" : System.out.println("Day 7 of the week");
		break;
		default: System.out.println("Invalid Input");
		}
	}
}
