package phonebook;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Danil",573835782);
        phoneDirectory.add("Pasha", 7777777);
        phoneDirectory.add("Danil", 937078747);
        System.out.println(phoneDirectory.findAll("Danil"));
        System.out.println(phoneDirectory.find("Danil"));
        System.out.println(phoneDirectory.find("Pasha"));
        System.out.println(phoneDirectory.find("Ban"));
        System.out.println(phoneDirectory.findAll("Bill"));
    }
}
