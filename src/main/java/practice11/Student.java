package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass=klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public void setKlass(Klass klass) {
        this.klass=klass;
    }
    public String introduce() {
        String str;
        String classNumber=String.valueOf(this.getKlass().getNumber());
        Student classLeader=this.klass.getLeader();
        String tmp=(this.equals(classLeader))?"Leader of Class " : "at Class ";
        str = super.introduce() + " I am a Student. I am " + tmp + classNumber + ".";
        return str;
    }

}