package practice05;

public class Student extends Person{
    private int Klass;

    public Student(String name,int age,int Klass) {
        super(name, age);
        this.Klass=Klass;
    }
    public int getKlass(){
        return this.Klass;
    }

/*
    public String introduce() {
        String s=(Klass!=0)?"Class "+Integer.valueOf(this.Klass)+".":"no Class.";
        String str=super.introduce()+" I am a Teacher. I teach "+s;
        return str;
    }
*/
}
