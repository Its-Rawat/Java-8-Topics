package loopsTypes;

import java.util.ArrayList;
import java.util.Scanner;

class initForLoop{
    public ArrayList<String> traverseList(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Aditya");
        names.add("Aaysuh");
        names.add("Deewanshi");
        names.add("Serina");

        Scanner EnrollemtInput = new Scanner(System.in);
        ArrayList<Integer> enrollemnt = new ArrayList<>();
        ArrayList<String> stuData = new ArrayList<>();

        // System.out.println(names.size());
        for(int i = 0; i<names.size() ;i++){
            if(i==names.size()){
                break;
            }
            System.out.print("At Index:"+i+" "+names.get(i)+" Enter Your Enrollment: ");
            enrollemnt.add(EnrollemtInput.nextInt());
            stuData.add((names.get(i)+" "+enrollemnt.get(i)));
        }
        
        return stuData;
    }
}

public class forLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        initForLoop tl = new initForLoop();
        ArrayList<String> showData = tl.traverseList();
        // showData = tl.traverseList();
        for(int i =0 ; i<showData.size();i++){
            System.out.println(showData.get(i));
        }
    }
}
