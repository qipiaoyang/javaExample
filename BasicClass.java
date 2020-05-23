
public class BasicClass {
    private String name;
    private int id;
    public BasicClass(String Name, int Id) {
        name = Name;
        id = Id;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + " 正在睡");
    }
    public void introdution() {
        System.out.println("大家好！我是    " + id + "号" + name + "，，，，，，");
    }
    public static void main(String[] args) {

    }
}
