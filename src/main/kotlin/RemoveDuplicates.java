import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args){
        Integer[] arrayInt={1,2,3,3,4,4,5,5,6,6,7,7,8,9};
        List<Integer> arrList=Arrays.asList(arrayInt);

        //!st way using Hashset
        Set<Integer> arr=new HashSet<>(arrList);
        System.out.println(arr);

        //2nd way using Stream
        List<Integer> arr1=arrList.stream().distinct().collect(Collectors.toList());
        System.out.println(arr1);

        //3rd way using tempList variable
        List<Integer> arr2=new ArrayList<>(Arrays.asList(arrayInt));
        List<Integer> tempList=new ArrayList<>();
        for (Integer el:arr2){
            if (!tempList.contains(el)){
                tempList.add(el);
            }
        }
        arr2=tempList;
        System.out.println(arr2);


    }
}
