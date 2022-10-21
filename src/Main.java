import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("PhuRe", 28, "Q10");
        Student student2 = new Student("TungHeo", 19, "TienGiang");
        Student student3 = new Student("MaiChubby" , 24, "ThuDuc");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer,Student > student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(".........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}