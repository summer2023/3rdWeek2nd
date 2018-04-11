package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number=number;
    }
    public Klass(){

    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        String str = "Class " + this.getNumber();
        return str;
    }
}
