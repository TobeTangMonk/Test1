package Date.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class 日期{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date date=new Date();
     System.out.println(date);
     SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd天 HH:mm:ss");     
     
     String result=simpleDateFormat.format(date);
     System.out.println(result);
     
      try {   //simpleDateFormat(yyyy年MM月dd天 HH:mm:ss");  两个格式要一致   
		simpleDateFormat.parse("2020年3月24天 15:23:12");//格式不对解析异常java.text.ParseException: Unparseable date: "2020-03-24 15:23:12"at java.text.DateFormat.parse(DateFormat.java:357)
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
      
     //date 还可以通过带参数的方法创建Date对象
      date=new Date(System.currentTimeMillis()+1000);
//     Calendar
      
      Calendar calendar=Calendar.getInstance();//当前的系统时间
      
      
//      Date 和Calendar对象相互转换
      
     date=calendar.getTime();
     calendar.setTime(date);
     System.out.println(simpleDateFormat.format(calendar.getTime()));
     
//     常量
    // Calendar.YEAR;年
    
     
     
    //get 接受获取的字段值----当前calendar对象代表的时间的字段值
     System.out.println(""+calendar.get(1 )+"年"+(calendar.get(calendar.MONTH)+1)+calendar.get(calendar.DATE));       
     
//       System.out.println("年"+calendar.get(1));
     
     
//        月份看                  System.out.println(Calendar.JANUARY);
     System.out.println(Calendar.JANUARY);
     
     
     
     
//     java.time包
     
     
 
     
//     LocalDate LoalTime LocalDateTime
         
//       LocalDate localDate=LocalDateTime.now();
//         
//       System.out.println(localDate);
//     
	}

}
