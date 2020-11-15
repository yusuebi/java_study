import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {
  public static void main(String[] args) {
    //　現在の日付の取得
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    //　日時情報をCalendarにセット
    c.setTime(now);
    //　Calendarから日の情報を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    //　Calendarの日にセット
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    //　Calendarの日付情報をDate型に変換
    Date future = c.getTime();
    //　指定された形式で表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}
