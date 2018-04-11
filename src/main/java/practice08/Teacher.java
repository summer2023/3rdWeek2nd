package practice08;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }
    public String introduce() {
        String tmp = this.klass == null ? "No Class" : "Class " + this.klass.getNumber();
        String str=super.introduce()+" I am a Teacher. I teach "+tmp+"" +
                ".";
        return str;
    }

    public String introduceWith(Student student) {
        int classNumber=student.getKlass().getNumber();
        int curclassNumber=this.klass.getNumber();
        String tmp = classNumber == curclassNumber ? "teach " : "don't teach ";
        String str=super.introduce()+" I am a Teacher. I "+tmp+student.getName()+".";
        return str;
    }

}
