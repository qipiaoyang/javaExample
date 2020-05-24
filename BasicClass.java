class Animal {
    void eat() {
        System.out.println("animal : eat");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("dog eat");
    }
    void eatTest() {
        this.eat();
        super.eat();
    }
}
public class BasicClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
//    方法可以重载，重载必须是在一个类里面，方法名字相同，而参数不同
//    方法可以重写，但是重写的方法返回值以及形参都不能改变
        Dog d = new Dog();
        d.eatTest();
    }
}
