package january25;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Radical technologies      ";
		
		
		System.out.println(name.charAt(5));
		System.out.println(name.concat(", Pune"));
		System.out.println(name.indexOf("cal"));
		System.out.println(name.indexOf('t'));
		
		System.out.println(name.equals("Radical technologies"));
		
		System.out.println(name.substring(4));
		System.out.println(name.substring(4, 12));
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace('t', 'T'));
		
		System.out.println(name.replace("tech", "TECH"));
		
		System.out.println(name.length());
		System.out.println(name.trim());
		
	}

}
