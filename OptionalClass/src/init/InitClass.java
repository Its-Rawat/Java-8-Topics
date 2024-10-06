package init;

import java.util.Optional;

import implementation.ImplClass1;
import implementation.getDetails;

public class InitClass {

	public static void main(String[] args) {
		// init impl1
		ImplClass1 implClass1 = new ImplClass1();
		implClass1.initOptionalClass();
		
		getDetails getdetails = new getDetails();
		Optional<String> name =  getdetails.getName();
		
		System.out.println(name.orElse("Name not Given"));

	}

}
