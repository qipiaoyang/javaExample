
public class AbstractClass {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    abstract void show(int Age, String Name) {
        System.out.println(Name + "当前的年龄是   " + Age);
    };
}

class Dog extends Animal {
    
}