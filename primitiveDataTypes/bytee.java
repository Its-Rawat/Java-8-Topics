package primitiveDataTypes;
import java.util.Scanner;

class getByte extends bytee{
    
    public void getData(byte val){
        System.out.println("Byte Value: "+val);
        
    }

}


public class bytee{
    public static void main(String[] args) {
        byte smallNumber;
        System.out.print("Enter a Byte Value (-128-127):");
        try{
            Scanner userInput = new Scanner(System.in);
            smallNumber = userInput.nextByte();
            getByte getbyte = new getByte();
            getbyte.getData(smallNumber);
        }catch(Exception e){
            System.out.println("User Input Error");
        }
}
    
}