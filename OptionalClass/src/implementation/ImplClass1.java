package implementation;
import java.util.Optional;

public class ImplClass1 {
	
	// Optional Class
	
	public void initOptionalClass() {
//		String str = "Hey this is some` String..";
		String str = null;
		
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional);
		System.out.println(optional.isPresent());
//		System.out.println(optional.get());
		
		str = optional.orElse("If str is null so this will get sout");
		System.out.println(str);
		
		
		
	}
	
}
