import java.util.Scanner;

public class HelloUser {
	String userName; 
	
	public HelloUser(String userName){
		this.userName = userName; 
	}

	
	public static void main(String[]args){
		System.out.println("Hello ASE2017 - how are you? :)");
		System.out.println("Please enter your name: ");
		
		Scanner reader = new Scanner(System.in); 
		String userName = reader.next();
		reader.close();
		
		HelloUser user = new HelloUser (userName);
		user.greetUser();	
		
	}
	
	
	public void greetUser(){
		System.out.println("Hello "+ this.userName + "!");
	}

}
