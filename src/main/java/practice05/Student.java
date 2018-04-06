package practice05;

public class Student {
    private int age;
    private  String name;
    private int Klass;

    public Student(String name,int age,int Klass) {
        this.age=age;
        this.name=name;
        this.Klass=Klass;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public int getKlass(){
        return this.Klass;
    }

    public String introduce() {
        String str="My name is "+this.name+". I am "+this.age+" year old. I am a Student. I am at Class "+this.Klass+". ";
        return str;
    }
}
