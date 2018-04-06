package practice04;

public class Worker {
    private int age;
    private  String name;

    public Worker(String name,int age) {
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
        String str="My name is "+this.name+". I am "+this.age+" year old.I am a Worker. I have a job";
        return str;
    }

}
