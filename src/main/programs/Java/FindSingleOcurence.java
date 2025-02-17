package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class FindSingleOcurence {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 5, 4, 4, 1, 3};
        Map<Integer, List<Integer>> groupedNumbers = new HashMap<>();
        List<Integer> singleOccurrences = new ArrayList<>();

        for (int number : numbers) {
            if (groupedNumbers.containsKey(number)) {
                List<Integer> existingList = groupedNumbers.get(number);
                existingList.add(number);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(number);
                groupedNumbers.put(number, newList);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : groupedNumbers.entrySet()) {
            if (entry.getValue().size() == 1) {
                singleOccurrences.add(entry.getKey());
            }
        }

        System.out.println(singleOccurrences);
    }
}
