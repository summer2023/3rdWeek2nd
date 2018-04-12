package practice10;

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

    public boolean isIn(Student student) {
        if(this.getNumber()==student.getKlass().getNumber()){
            return true;
        }
        return false;
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

    @Override
    public boolean equals(Object anObject) {
        if (this==anObject) {
            return true;
        }
        if (anObject instanceof Klass) {
            Klass klass=(Klass)anObject;
            if (this.getNumber() == klass.getNumber()) {
                return true;
            }
        }
        return false;
    }
}
