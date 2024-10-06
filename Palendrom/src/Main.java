import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        String n = in.next();
//
//        boolean isPalendrom = IntStream.range(0, n.length() / 2).allMatch(
//                i -> n.charAt(i) == n.charAt(n.length() - i - 1)
//        );
//        System.out.println(isPalendrom ? "Palendrom" : "Not a Palendrom");
//    }

//        int val;
//        int x,r;
//        int s = 0;
//        int val = n;
//        while(n>0){
//            r = n%10;
//            s = (s*10)+r;
//            n = n/10;
//        }
//        if(val == s) {
//            System.out.println("Palendrom " + val + " == " + s);
//        }else{
//            System.out.println("Not Palendrom " + val + " == " + s);
//        }
//}

//        // Armstrong Number
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int userNumber = in.nextInt();
//        int rem, rst = 0;
//        int usernumber = userNumber;
//        while(userNumber > 0){
//            rem = userNumber % 10;
//            rst = rst + (rem*rem*rem);
//            userNumber = userNumber /10;
//        }
//        if(usernumber == rst){
//            System.out.println("Yes, Its a Armstrong Number");
//        }else{
//            System.out.println("No, Its not a Armstrong Number");
//        }
//
//    }


        // Prime Number

//    public static void main(String[] args) {
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int userVal = scanner.nextInt();
//
//        for(int i = 1; i<= userVal; i++){
//            if(userVal%i == 0){
//                count++;
//            }
//        }
//
//        if(count==2){
//            System.out.println("Prime Number");
//        }else{
//            System.out.println("Not Prime Number");
//        }
//
//    }
//
//   public static void main(String[] args) {
//      String z = "hello world";
//      String reversed = "";
//      for(int i = z.length() -1 ; i>=0 ; i--){
//         reversed += z.charAt(i);
//      }
//      System.out.println(reversed);
//
//      // using StringBuilder
//
//      StringBuilder sb = new StringBuilder(reversed);
//      System.out.println(sb.reverse().toString());
//
//
//   }


//   public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter a Number: ");
//      int num = scanner.nextInt();
//
//      System.out.println("Suare root of "+num+" --> "+Math.sqrt(num));
//
//   }
//
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      String num = scanner.next();
      boolean check = IntStream.range(0,num.length()/2).allMatch(
              i->num.charAt(i) == num.charAt(num.length() - i -1)
      );
      if(check == true){
         System.out.println("Palendrom");
      }else{
         System.out.println("Not a palendrom");
      }
   }

}