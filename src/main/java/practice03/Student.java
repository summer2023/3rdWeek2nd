package practice03;

public class Student extends Person{
    private int Klass;

    public Student(String name,int age,int Klass) {
        super(name,age);
        this.Klass=Klass;
    }
    public int getKlass(){
        return this.Klass;
    }

    public String introduce() {
        String str="I am a Student. I am at Class "+this.Klass+".";
        return str;
    }
}
