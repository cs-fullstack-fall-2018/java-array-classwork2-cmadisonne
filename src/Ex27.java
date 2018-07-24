import java.util.ArrayList;
import java.util.Arrays;

public class Ex27 {
    public static void main(String[] args){
        ArrayList<Integer>numArray = new ArrayList<Integer>();
        numArray.addAll(Arrays.asList(5, 10, 2, 8, 7));
        newNumArray(numArray);
    }
    public static void newNumArray(ArrayList<Integer> numArray){
        System.out.println(numArray);
    }
}
