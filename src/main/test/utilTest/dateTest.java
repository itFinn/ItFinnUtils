package utilTest;

import com.itfinn.utils.base.Print;
import com.itfinn.utils.date.DateUtils;

import java.util.Date;

/**
 * @author itFinn.com
 * @date 2018-06-12 14:26
 */
public class dateTest {

    public static void main(String[] args) {

        // 传入日期获取星期几
        Print.print(DateUtils.getWeekOfDate(new Date()));
        Print.print();

        //根据指定格式获取当前时间
        Print.print("yyyy-MM-dd:\t" + DateUtils.getCurrentTime(DateUtils.sdf_day.toPattern()));
        Print.print("yyyy/MM/dd:\t" + DateUtils.getCurrentTime(DateUtils.sdf_day_m.toPattern()));
        Print.print("yyyyMMdd:\t" + DateUtils.getCurrentTime(DateUtils.sdf.toPattern()));
        Print.print("yyyy-MM-dd hh:mm:ss:\t" + DateUtils.getCurrentTime(DateUtils.sdf_day_time.toPattern()));
        Print.print("yyyy年M月d日:\t" + DateUtils.getCurrentTime(DateUtils.sdf_chin_day_time.toPattern()));
        Print.print("yyyy年M月d日 HH:mm:\t" + DateUtils.getCurrentTime(DateUtils.sdf_yyyy_mm.toPattern()));
        Print.print("MM-dd: " + DateUtils.getCurrentTime(DateUtils.sdf_day_short.toPattern()));
        Print.print();





    }
}
