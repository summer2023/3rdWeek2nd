package practice11;

public class Person {
    private int age;
    private String name;
    private int id;

    public Person(int id,String name,int age) {
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public String introduce() {
        String str="My name is "+this.name+". I am "+this.age+" years old.";
        return str;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Person) {
            Person person = (Person)anObject;
            if (this.id == person.id) {
                return true;
            }
        }
        return false;
    }

}
