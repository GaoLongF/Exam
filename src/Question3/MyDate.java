package Question3;

public class MyDate
{
    private static final int YEAR=365*24*60*60;
    private static final int DAY=24*60*60;
    private static final int MONTH=31*60*60;
    private static final int HOUR=60*60;
    //时间戳是指格林威治时间1970年01月01日00时00分00秒
    // (北京时间1970年01月01日08时00分00秒)起至现在的总毫秒数。

    //选择时区按365天算,31536000秒
    public static void choicezone(String str,int time)
    {
        int tempyear=0;
        int tempday=0;
        int tempmonth=0;
        int temphour=00;
        int tempminute=00;
        int tempsecond=00;
        if(str.equals("格林威治"))
        {
            String TIME=trans(time);
            System.out.println(TIME);
        }else if(str.equals("北京"))
        {

        }
    }


    public static String trans(int time)
    {
        int tempyear=0;
        int tempday=0;
        int tempmonth=0;
        int temphour=00;
        int tempminute=00;
        int tempsecond=00;
        tempyear=time/YEAR;
        tempmonth=(time-tempyear*YEAR)/MONTH;
        tempday=(time-tempyear*YEAR-tempmonth*MONTH)/DAY;
        temphour=(time-tempyear*YEAR-tempmonth*MONTH-tempday*DAY)/HOUR;
        tempminute=(time-tempyear*YEAR-tempmonth*MONTH-tempday*DAY-temphour*HOUR)/60;
        tempsecond=(time-tempyear*YEAR-tempmonth*MONTH-tempday*DAY-temphour*HOUR-tempminute*60);
        String Time=(1970+tempyear)+"年"+(1+tempmonth)+"月"+(1+tempday)+"日"+temphour+"时"+tempminute+"分"+tempsecond+"秒";
       return Time;
    }

    //加减时间
    public static void changeTime()
    {

    }

    //时区转换
    private static void trasTime()
    {

    }
}
//未完成