package practice05;

public class Person {
    private int age;
    private  String name;

    public Person(String name,int age) {
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    public String introduce() {
        String str="My name is "+this.name+". I am "+this.age+" years old.";
        return str;
    }
}
