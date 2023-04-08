package task2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer[] array = {12, 32, 123, 231, 2};
        System.out.println(toList(array));
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>(array.length);
        for (T i : array) {
            list.add(i);
        }
        return list;
    }
}
