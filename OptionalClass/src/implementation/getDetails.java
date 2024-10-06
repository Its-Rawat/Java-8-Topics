package implementation;

import java.util.Optional;
import java.util.Scanner;

public class getDetails {
	
	
	public Optional<String> getName(){
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		// remove comment to send null name
//		name = null;
		return Optional.ofNullable(name);
		
	}

}
