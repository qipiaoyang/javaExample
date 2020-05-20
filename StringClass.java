
public class StringClass {

    public static void main(String[] args) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd', '!'};
        String helloString = new String(helloArray);
        System.out.println( helloString );
        System.out.println("字符串长度" + helloString.length());

        String newString = helloString.concat("every one");
        System.out.println(newString);

        String[] strArr = newString.split("ll");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www"); // StringBuffer添加
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        sBuffer.reverse(); // stringBuffer反转
        System.out.println(sBuffer);

        sBuffer.setLength(100);


        sBuffer.delete(3, sBuffer.length());
        System.out.println(sBuffer + "     stringBuffer删除");

        sBuffer.insert(1, "新增");
        System.out.println(sBuffer + "   stringBuffer新增");

        sBuffer.replace(1, 3, "替换"); // stringbuffer替换
        System.out.println(sBuffer + "   stringBuffer替换");


        System.out.println(sBuffer.capacity() + "    当前剩余长度");


        String newBuffer = sBuffer.substring(0,3);
        System.out.println(newBuffer + "   subString的string");


    }
}

