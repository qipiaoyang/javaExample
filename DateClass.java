import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateClass {

    public static void main(String[] args) {
        // 初始化一个date对象
        Date date = new Date();

        // 使用toString() 函数显示日期
        System.out.println(date.toString());

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        Date newDate = new Date();
        String dateStr = dateFormat.format(newDate);
        System.out.println(dateStr + "    格式化之后的格式");

//        try {
//            System.out.println(new Date() + "\n");
//            Thread.sleep(1000*3);
//            System.out.println(new Date() + "\n");
//        } catch (Exception e) {
//            System.out.println("got an exception");
//        }


        // Calendar 类
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int date1 = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR);
        int hour_of_day = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "       当前的年份");
        System.out.println(month + "       当前的月份"); // 月份从0开始
        System.out.println(date1 + "       当前的天");
        System.out.println(hour + "       当前的小时"); // 12小时制的时间
        System.out.println(hour_of_day + "       当前的小时"); // 24小时制的时间
        System.out.println(minute + "       当前的分钟"); // 显示19点
        System.out.println(second + "       当前的秒"); // 显示19点
        System.out.println(day + "       当前星期几"); // 1代表星期日， 2代表星期一


        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
        int year1;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gcalendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year1 = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if(gcalendar.isLeapYear(year1)) {
            System.out.println("当前年份是闰年");
        }
        else {
            System.out.println("当前年份不是闰年");
        }


    }
}

