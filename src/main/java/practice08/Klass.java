package practice08;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number=number;
    }
    public Klass(){    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        String str = "Class " + this.getNumber();
        return str;
    }

    public void assignLeader(Student student) {
        leader=student;
    }

    public Student getLeader() {
        return leader;
    }
}
