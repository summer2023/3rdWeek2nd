package practice09;

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
    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber()!=this.getNumber()){
            System.out.print("It is not one of us.");
        }else{
            leader=student;
        }
    }

    public Student getLeader() {
        return leader;
    }

}
