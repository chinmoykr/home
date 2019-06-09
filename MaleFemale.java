Import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		String gender;
		System.out.print("select your gender for male type 'm' and for female type 'f' : " );
		Scanner uinput = new Scanner(System.in);
		gender = uinput.nextLine().toString().toUpperCase();
		String setGender = gender;
		
		if (setGender == "M") { 
			setGender = "he"; 
			}
		else if (setGender == "F") {
			setGender = "she"; 
			}
		System.out.println(setGender);
		
	
	}
}
