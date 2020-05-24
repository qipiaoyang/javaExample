class Animal {
    void eat(int food) {
        System.out.println("animal : eat" + food);
    }

    public int eat() {
        return 99999;
    }
}
class Dog extends Animal {
    void eat(int newFood) {
        System.out.println("dog eat" + newFood);
    }
    void eatTest(int eatNumber) {
        this.eat(eatNumber);
        super.eat(eatNumber);
    }
}
public class OverrideClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat(123);
        int b = a.eat();
        System.out.println(b + "b=============");
        Dog d = new Dog();
        d.eatTest(456);
    }
}
