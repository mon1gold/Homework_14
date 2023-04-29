package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 32, 12, 3213, 213, 12, 32);
        System.out.println(findUnique(list));
    }

    public static <T> List<T> findUnique(List<T> element) {
        List<T> newList = new ArrayList<>();
        if (element.isEmpty()) {
            return newList;
        }
        for (T elements : element) {
            int count = 0;
            for (T currentElement : element) {
                if (!Objects.equals(element, currentElement)) {
                    count++;
                }
            }
            if (count == 1) {
                newList.add(elements);
            }
        }
        return newList;
    }
}
