package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneDirectory {
    List<Record> phoneDirectory = new ArrayList<>();

    public void add(String name, int phoneNumber) {
        phoneDirectory.add(new Record(name, phoneNumber));
    }

    public Record find(String name) {
        for (Record record : phoneDirectory) {
            if (Objects.equals(record.getName(), name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> list = new ArrayList<>();
        for (Record record : phoneDirectory) {
            if (Objects.equals(record.getName(), name)) {
                list.add(record);
            }
        }
        return list.isEmpty() ? null : list;
    }
}
