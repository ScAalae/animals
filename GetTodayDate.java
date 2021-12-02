package Tierpackage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTodayDate {
    public static void main(String[] args) {

        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        System.out.println(formattedDate);
    }
}
