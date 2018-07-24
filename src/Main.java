import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	EXERCISE 25 //
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("Bob");
        squadList.add("John");
        squadList.add("Kenn");
        squadList.add("Kevin");
        squadList.remove("Kenn");
        System.out.println(squadList);
        System.out.println(squadList.size());
        if (squadList.contains("Kevin")){
            System.out.println("Kevin is in the Array");
        }
        else{
            System.out.println("Kevin is not in the array");
        }

    }
}
