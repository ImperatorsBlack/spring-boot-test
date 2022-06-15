import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "pushkar", 150000, "comp"));
        studentList.add(new Student(4, "john", 100000,"ETC"));
        studentList.add(new Student(3, "amar", 120000,"civil"));
        studentList.add(new Student(2, "kane", 160000,"comp"));
        studentList.add(new Student(6, "taker", 180000,"ETC"));
        studentList.add(new Student(5, "bob", 170000,"comp"));

        Optional<Integer> first = studentList.stream()
                .map(Student::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("first = " + first);

        Map<String, String> stringMap = studentList.stream()
                .collect(Collectors
                .toMap(Student::getDept, Student::getStudentName, (s, a) -> s + ", " + a)
                );

        stringMap.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("stringMap = " + stringMap);



        int[] arr = {1,1,3,2,2,5,4,4,6,8,8,7};

        for(int i: arr){
            int count = 0;
            for (int j: arr){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]+ " ");
            }
        }

        System.out.println("Exit Bye");

    }
}
