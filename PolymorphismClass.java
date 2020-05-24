
public class PolymorphismClass {
    public static void main(String[] args) {
        /**
         * 多态的优点
         * 1. 可替换性
         * 2. 可扩充性
         * 3. 解耦合
         * 4. 接口性
         * 5. 灵活性
         * 6. 简化性
         * 多态存在的三个必要条件
         * 继承、重写、父类引用指向子类对象
         */
//        show(new Cat()); // 以Cat对象调用 show方法
//        show(new Dog()); // 以Dog对象调用show方法
        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.work();
    }
    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if(a instanceof Cat) {
            Cat c = (Cat)a;
            c.work();
        } else if(a instanceof Dog) {
            Dog c = (Dog)a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}
class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
