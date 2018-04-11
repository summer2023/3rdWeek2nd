package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce() {
        //String s=klass!=null?"Class "+this.getKlass().getNumber()+".":"no Class.";
        String str=super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        return str;
    }

}
