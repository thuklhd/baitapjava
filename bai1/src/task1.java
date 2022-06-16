public class task1 extends Thread {
    public static int  CheckReversibleNumber(int number) 
    {
     
            int  count2=0;
            int count=0;
            int i=0;
            int arr[]=new int[10];
            while(number>0)
            {
              arr[count]=number%10;
              number=number/10;
             count++;
             
            }
           
            for(int j=0;j<((count)/2);j++)
            {
             
                if(arr[j]!=arr[(count)-1-j])
                {
                    count2++;
                }
            }
           // kiểm tra xem có số nào đối xứng khác 
            if(count2!=0)
            {
               return 0;
            }
            else
            {
              return 1;
            }
  
           
      }
      public static int CheckPrimeNumber(int number) {
          
          
              int count=0;
              for(int i=1;i<=number;i++)
              {
        if(number%i==0)
        {
       count++;
        }
      }
        if(count==2)
        {
        return 1;
        }
        else 
        {
          return 0;
           
        }
      }
    static  int CheckTotal(int number)
      {
          int count=0;
          int sum=0;
  while(number>0)
  {
      sum =sum+number%10;
      number=number/10;
     
    
  }
  if(CheckReversibleNumber(sum)==1)
  {
      return 1;
  }
  else
  {
      return 0;
  }
  
  
  
      }
@Override
public void run() {
    // TODO Auto-generated method stub
    super.run();
    for(int i=1000000;i<3000000;i++)
    {
          if( CheckReversibleNumber(i)==1&&CheckPrimeNumber(i)==1&&CheckTotal(i)==1)
          {
              System.out.println(i);
          }
    }
   
  }
}  
  

