package Date.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ����{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date date=new Date();
     System.out.println(date);
     SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");     
     
     String result=simpleDateFormat.format(date);
     System.out.println(result);
     
      try {   //simpleDateFormat(yyyy��MM��dd�� HH:mm:ss");  ������ʽҪһ��   
		simpleDateFormat.parse("2020��3��24�� 15:23:12");//��ʽ���Խ����쳣java.text.ParseException: Unparseable date: "2020-03-24 15:23:12"at java.text.DateFormat.parse(DateFormat.java:357)
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
      
     //date ������ͨ���������ķ�������Date����
      date=new Date(System.currentTimeMillis()+1000);
//     Calendar
      
      Calendar calendar=Calendar.getInstance();//��ǰ��ϵͳʱ��
      
      
//      Date ��Calendar�����໥ת��
      
     date=calendar.getTime();
     calendar.setTime(date);
     System.out.println(simpleDateFormat.format(calendar.getTime()));
     
//     ����
    // Calendar.YEAR;��
    
     
     
    //get ���ܻ�ȡ���ֶ�ֵ----��ǰcalendar��������ʱ����ֶ�ֵ
     System.out.println(""+calendar.get(1 )+"��"+(calendar.get(calendar.MONTH)+1)+calendar.get(calendar.DATE));       
     
//       System.out.println("��"+calendar.get(1));
     
     
//        �·ݿ�                  System.out.println(Calendar.JANUARY);
     System.out.println(Calendar.JANUARY);
     
     
     
     
//     java.time��
     
     
 
     
//     LocalDate LoalTime LocalDateTime
         
//       LocalDate localDate=LocalDateTime.now();
//         
//       System.out.println(localDate);
//     
	}

}
