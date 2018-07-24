import java.util.ArrayList;
import java.util.Arrays;

public class Ex26 {
    public static void main(String [] args){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList("Bob", "John", "Kenn", "Kevin"));
        System.out.println(StudentList(studentList));

    }
    public static String StudentList(ArrayList<String> studentList){
        return studentList.get(2);

    }
}
