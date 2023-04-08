package task1;

import java.util.ArrayList;
import java.util.List;

public class main {
    private static String string = "java";

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        String word1 = "programing";
        String word2 = "java";
        String word3 = "python";
        String word4 = "java";
        String word5 = "car";
        String word6 = "sun";
        String word7 = "java";
        String word8 = "football";
        String word9 = "python";
        String word10 = "basketball";
        stringList.add(word1);
        stringList.add(word2);
        stringList.add(word3);
        stringList.add(word4);
        stringList.add(word5);
        stringList.add(word6);
        stringList.add(word7);
        stringList.add(word8);
        stringList.add(word9);
        stringList.add(word10);
        System.out.println(countOccurance(stringList, string));
    }

    public static int countOccurance(List<String> stringList, String line) {
        int count = 0;
        for (String element : stringList) {
            if (element.equals(line)) {
                count++;
            }
        }
        return count;
    }
}
