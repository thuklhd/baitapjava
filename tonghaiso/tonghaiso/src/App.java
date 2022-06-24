import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class App {




  static String fill(String string,String b)
  {
    string=daoXau(string);
   
   
    for (int i =0; i <=(b.length()- string.length()+25); i++) {
      string=string+ "0";
    }
    string=daoXau(string);
  
    return string;
  }





  static String daoXau(String s) {
    String s1 = "";
    for (int i = 0; i < s.length(); i++) {
        s1 += s.charAt(s.length() - 1 - i);
    }
    return s1; 
}
 





   static String total( String numbera, String numberb)
   {
    String s="";
    int len1=numbera.length();
    int len2=numberb.length();
    if ( len2>len1) {
    numbera= fill(numbera, numberb);
  }


 else if (len1>len2 ) {
  numberb=fill(numberb, numberb);
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
