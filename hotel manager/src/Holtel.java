import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Holtel {
   private String TypeRoom;
   private int amountOfDays;
   private int AmountOfARoom;
   private int AmountOfBRoom;
   private int AmountOfCRoom;
 
    Scanner sc = new Scanner(System.in);
    public int getAmountOfARoom() {
        return AmountOfARoom;
    }
    public int getAmountOfBRoom() {
        return AmountOfBRoom;
    }public int getAmountOfCRoom() {
        return AmountOfCRoom;
    }public void setAmountOfARoom(int amountOfARoom) {
        AmountOfARoom = amountOfARoom;
    }
    public void setAmountOfBRoom(int amountOfBRoom) {
        AmountOfBRoom = amountOfBRoom;
    }
    public void setAmountOfCRoom(int amoutOfCRoom) {
        AmountOfCRoom = amoutOfCRoom;
    }

   
    
   
    public void enter() {
        System.out.println("nhap vao thong tin khach san");
       System.out.println("nhap vao so phong loai A");
       setAmountOfARoom(sc.nextInt());
       System.out.println("nhap vao so phong loai B");
       setAmountOfBRoom(sc.nextInt());
       System.out.println("nhap vao so phong loai C");
       setAmountOfCRoom(sc.nextInt());


      
    }
   void display()
   {
System.out.println("so phong loai A con lai la"+getAmountOfARoom());
System.out.println("so phong loai B con lai la"+getAmountOfBRoom());
System.out.println("so phong loai C con lai la"+getAmountOfCRoom());
   }
    
}
