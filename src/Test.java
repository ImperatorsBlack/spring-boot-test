import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {


//        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,3,2,2,5,4,4,6,8,8,7));
//
//        System.out.println(list);
//
//        for(int num: list){
//
//        }
//
//        List<Integer> listWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(listWithoutDuplicates);

        int[] arr = {1,1,3,2,2,5,4,4,6,8,8,7};

        for(int i: arr){
            int count = 0;
            for(int j: arr){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]+ " ");
            }
        }

        System.out.println("Exit");

    }
}
