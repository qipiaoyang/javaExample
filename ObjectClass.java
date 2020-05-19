

public class ObjectClass {
    int puppyAge;
    void barking() {

    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为" + puppyAge);
        return puppyAge;
    }

    public ObjectClass(String name) {
        System.out.println("小狗的名字是" + name);
    }
    public static void main(String[] args) {
        /**
         * 创建小狗
         */
        ObjectClass myPuppy = new ObjectClass("tommy");
        myPuppy.setAge(22);
        myPuppy.getAge( );
        System.out.println("变量为：" + myPuppy.puppyAge);
        /**
         * 创建职位
         */
        Employee emplyeeOne = new Employee("RUNOOB1");
        emplyeeOne.empAge(26);
        emplyeeOne.empDesigation("高级程序猿");
        emplyeeOne.empSalary(1000);
        emplyeeOne.printEmployee();

        Employee emplyeeTwo = new Employee("RUNOOB2");
        emplyeeTwo.empAge(21);
        emplyeeTwo.empDesigation("菜鸟程序猿");
        emplyeeTwo.empSalary(500);
        emplyeeTwo.printEmployee();


    }
}

/**
 * 一个文件夹只能有一个跟文件夹名字相同的 public 顶层类
 */
class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }
    public void empAge(int empAge) {
        this.age = empAge;
    }
    public void empDesigation(String empDesig) {
        this.designation = empDesig;
    }
    public void empSalary(double empSalary) {
        this.salary = empSalary;
    }
    public void printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}

