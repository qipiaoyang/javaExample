
class FreshJuice {
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE };
    FreshJuiceSize size;
}

public class Main {

    public static void main(String[] args) {
        System.out.println("hello,world!");

        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        System.out.println(juice.size);
    }
}

