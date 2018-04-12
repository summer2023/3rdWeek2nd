package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number=number;
    }
    public Klass(){    }

    public int getNumber() {
        return this.number;
    }

    public boolean isIn(Student student) {
        if(this.getNumber()==student.getKlass().getNumber()){
            return true;
        }
        return false;
    }

    public String getDisplayName() {
        String str = "Class " + this.getNumber();
        return str;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher=teacher;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (teacher != null) {
            teacher.notice(student);
        }
    }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber()!=this.getNumber()){
            System.out.print("It is not one of us.");
        }else{
            leader=student;
            if (teacher != null) {
                teacher.noticeLeader(student);
            }
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
