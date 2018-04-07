package practice06;

public class Teacher extends Person{
    private int Klass;

    public Teacher(String name,int age){
        super(name,age);
    }
    public Teacher(String name,int age,int Klass) {
        super(name, age);
        this.Klass=Klass;
    }
    public int getKlass(){
        return this.Klass;
    }

    public String introduce() {
        String str=super.introduce()+" I am a Teacher. I am at Class "+this.Klass+". ";
        return str;
    }
}
