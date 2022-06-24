import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class App {

  static String fill(String s,int max)
  {s=daoXau(s);
   
   
    for (int i =0; i <=max- s.length()+25; i++) {
      s=s+ "0";
    }
    s=daoXau(s);
  
    return s;
  }
  static String daoXau(String s) {
    String s1 = "";
    for (int i = 0; i < s.length(); i++) {
        s1 += s.charAt(s.length() - 1 - i);
    }
    return s1; //xuat chuoi sau khi dao
}
 
   static String total( String numbera, String numberb)
   {
    String s="";
    
   
    int len1=numbera.length();
    int len2=numberb.length();
    int max=max(len1,len2);
    if ( len2>len1) {
    numbera= fill(numbera, len2);
  }
 else if (len1>len2 ) {
  numberb=fill(numberb, len2);
  }
    int temp,temp2=0,sum;
    int length=numberb.length() ;
for(int i=numberb.length()-1;i>=0;i--)
{
sum=numbera.charAt(i)-'0'+numberb.charAt(i)-'0'+temp2;
  temp=sum%10;
  temp2=sum/10;
 s=s+temp;
 
}
 s=daoXau(s);
return s;
   }
    private static int max(int len1, int len2) {
      int max=0;
      if(len1>len2)
      max=len1;
      else
      max=len2;
    return max;
  }

    public static void main(String[] args) throws Exception {
        String a="655555555555555555554365435555555555555544745765476547654765476476";
        String b="65555555465547654755543654365465555555555547654755554765755555555544745765476547654765476436";
     
      System.out.println(total(a, b));
     
     
      
    }
}
