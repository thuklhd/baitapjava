import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       int selection;
       manage manage1 =new manage();
        do{
            System.out.println("nhap vao lua chon cua ban");
            System.out.println("1 nhap thong tin khach san");
            System.out.println("2 them  khach hang");
            System.out.println("3 xuat thong tin toan bo khach hang khach hang");
            System.out.println("4 tinh tien thue phong theo id");
            System.out.println("5 xoa thong tin khach hang");
            selection=sc.nextInt();
switch(selection)
{       
       
    case 1: 
     manage1.EnterHotelInformation();
      break;
    case 2:
manage1.EnterCustomerInformation();
break;
case 3:
manage1.ExportCustomerInformation();
break;
case 4:
manage1.bill();
break;
case 5:
manage1.DeleteCustomerInformation();
break;
}

        }while( selection!=0);
    }
    
}
