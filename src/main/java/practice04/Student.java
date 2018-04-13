package practice04;

public class Student extends Person{
    private int Klass;

    public Student(String name,int age,int Klass) {
        super(name, age);
        this.Klass=Klass;
    }
    public int getKlass(){
        return this.Klass;
    }

    public String introduce() {
        String str=super.introduce()+" I am a Student. I am at Class "+this.Klass+".";
        return str;
    }
}
