package plan.attack.OOPInterface;

public abstract class Person {
    //对类-接口、接口-接口的继承和实现关系进行实验
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void live();
    public abstract void same();
}
