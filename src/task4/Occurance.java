package task4;

public class Occurance {
    private String name;
    private int occurance;

    public Occurance(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccurance() {
        return occurance;
    }

    public void setOccurance(int occurance) {
        this.occurance = occurance;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurance=" + occurance +
                '}';
    }
}
