package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneDirectory {
    private List<Record> phoneDirectory = new ArrayList<>();

    public void add(String name, int phoneNumber) {
        phoneDirectory.add(new Record(name, phoneNumber));
    }

    public Record find(String name) {
        if (name == null) {
            return null;
        }
        for (Record record : phoneDirectory) {
            if (Objects.equals(record.getName(), name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        if (name == null) {
            return null;
        }
        List<Record> result = new ArrayList<>();
        for (Record record : phoneDirectory) {
            if (Objects.equals(record.getName(), name)) {
                result.add(record);
            }
        }
        return result.isEmpty() ? null : result;
    }
}
