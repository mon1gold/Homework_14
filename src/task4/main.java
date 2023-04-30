package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main {

    public static void main(String[] args) {
        List<String> list = List.of("fox", "cat", "fox", "bird", "dog", "cat", "fox", "cat", "fox", "bird");
        System.out.println(findOccurance(list));
    }

    private static List<Occurance> findOccurance(List<String> list) {
        List<Occurance> result = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            return result;
        }
        label:
        for (String element : list) {
            for (Occurance occurance : result) {
                if (Objects.equals(element, occurance.getName())) {
                    occurance.setOccurance(occurance.getOccurance() + 1);
                    continue label;
                }
            }
            result.add(new Occurance(element, 1));
        }
        return result;
    }
}
