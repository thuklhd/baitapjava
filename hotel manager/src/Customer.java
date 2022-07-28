import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Customer  {
    Scanner sc= new Scanner(System.in);
   private String name;
   private String age;
   private int IdNumber;
   private String TypeOfRentalRoom;
   private int AmountOfRentalDays;
    public String getAge() {
        return age;
    }
    public int getIdNumber() {
        return IdNumber;
    }
    public String getName() {
        return name;
    }
    public int getAmountOfRentalDays() {
        return AmountOfRentalDays;
    }
   public String getTypeOfRentalRoom() {
       return TypeOfRentalRoom;
   }
   public void setAmountOfRentalDays(int amountOfRentalDays) {
       AmountOfRentalDays = amountOfRentalDays;
   }
   public void setTypeOfRentalRoom(String typeOfRentalRoom) {
       TypeOfRentalRoom = typeOfRentalRoom;
   }
    public void setAge(String age) {
        this.age = age;
    }
    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void enter()
    {
System.out.println("nhap vao tong tin khach hang ban muon them");
System.out.println("nhap vao ten khach hang");
setName(sc.nextLine());
System.out.println("nhap vao tuoi khach hang");
setAge(sc.nextLine());
System.out.println("nhap vao id cua khach hang");
setIdNumber(sc.nextInt());sc.nextLine();
System.out.println("nhap vao loai phong khach muon thue");
setTypeOfRentalRoom(sc.nextLine());
System.out.println("nhap vao so ngay thue");
setAmountOfRentalDays(sc.nextInt());
    }
   public void display()
    {
        System.out.println("ten khach hang "+ getName());
        System.out.println("tuoi "+getAge());
        System.out.println("id "+getIdNumber());
        System.out.println("loai phong "+getTypeOfRentalRoom());
        System.out.println("so ngay thue "+getAmountOfRentalDays());
    }
public float pay()
{
    float money=0;
    if(getTypeOfRentalRoom().equals("a")||getTypeOfRentalRoom().equals("A"))
    {
        money=500*AmountOfRentalDays;
     
    }
    else if(getTypeOfRentalRoom().equals("b")||getTypeOfRentalRoom().equals("B"))
    {
        money=300*AmountOfRentalDays;
     
    }
    else if (getTypeOfRentalRoom().equals("c")||getTypeOfRentalRoom().equals("C"))
    {
        money=100*AmountOfRentalDays;
    }
   else 
   {
    money=0;
   }
   
return money;
}

}
