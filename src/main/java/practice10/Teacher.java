package practice10;

import java.util.HashSet;
import java.util.Vector;

public class Teacher extends Person{
    Klass klass;
    HashSet<Klass> classes;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, HashSet classes) {
        super(id,name,age);
        this.classes=classes;
    }
    public Klass getKlass() {
        return this.klass;
    }
    public String introduce() {
        String str = null;
        if(this.classes!=null){
            StringBuffer sb = new StringBuffer();
            for (Klass cl:classes) {
                sb.append(cl.getNumber()).append(", ");
            }
            String clnum=sb.toString();
            String tmp ="Class " + clnum.substring(0,clnum.length()-2);
            str=super.introduce()+" I am a Teacher. I teach "+tmp+".";
        }else if(this.klass!=null){
            String tmp ="Class " + this.klass.getNumber();
            str=super.introduce()+" I am a Teacher. I teach "+tmp+".";
        }else{
            String tmp="No Class";
            str=super.introduce()+" I am a Teacher. I teach "+tmp+".";
        }
        return str;
    }

    public String introduceWith(Student student) {
        String str=null;
        boolean flag=false;
        if(this.classes!=null){
            Vector<Integer> vc = new Vector<Integer>();
            for (Klass cl:classes) {
                if (cl.isIn(student)) {
                    flag=true;
                }
            }
        }else if(this.klass!=null){
            if (this.klass.isIn(student)) {
                flag=true;
            }
        }
        String tmp = flag ? "teach " : "don't teach ";
         str=super.introduce()+" I am a Teacher. I "+tmp+student.getName()+".";
        return str;
    }

    public HashSet<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        Klass tmp=student.getKlass();
        if ((this.klass != null && this.klass.equals(student.getKlass())) || this.classes.contains(student.getKlass())) {
            return true;
        }
            return false;
    }


}