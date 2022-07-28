import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class manage {
    Scanner sc =new Scanner(System.in);
    int selection=0,idNumber;
    Holtel HotelHaNoi=new Holtel();
    ArrayList<Customer> listcustomer=new ArrayList<Customer>();
    void DeleteCustomerInformation()
    {
        int checkIfTheObjectExists , arrsize=listcustomer.size();
        System.out.println("nhap vao id khach hang muon xoa ");
        idNumber=sc.nextInt();
        checkIfTheObjectExists=0;
        for(int i=0;i<listcustomer.size();i++)
        {
            if(listcustomer.get(i).getIdNumber()==idNumber)
            {  
              listcustomer.remove(i);
              System.out.println("da xoa thanh cong");
            }
           else
           {
            checkIfTheObjectExists++;
           }

            
        }
       if(checkIfTheObjectExists==arrsize)
       {
        System.out.println("khong tim thay thong tin vui long nhap lai !" );
       }

        }
        
   
    void tinhtien()
    {
        int checkIfTheObjectExists;
        System.out.println("nhap vao id muon kiem tra ");
        idNumber=sc.nextInt();
        checkIfTheObjectExists=0;
        for(int i=0;i<listcustomer.size();i++)
        {
            if(listcustomer.get(i).getIdNumber()==idNumber)
            {  
               System.out.println("khach hang :"+listcustomer.get(i).getName());
               System.out.println("so tien khach phai tra la :"+ listcustomer.get(i).pay()+"$");
            }
           else
           {
            checkIfTheObjectExists++;
           }

            
        }
       if(checkIfTheObjectExists==listcustomer.size())
       {
        System.out.println("khong tim thay thong tin vui long nhap lai !" );
       }

        }
        
        
    
    void EnterHotelInformation()
    {
        HotelHaNoi.enter();
    }
    void EnterCustomerInformation()
    { int test=0;
        Customer customer =new Customer();
         HotelHaNoi.display();

do{
    if(test==1)
    {
        System.out.println("phong da het vui long chon phong khac");
    }
    test=0;
    HotelHaNoi.display();
customer.enter();
if(customer.getTypeOfRentalRoom().equals("a")||customer.getTypeOfRentalRoom().equals("A"))
    {
    if(HotelHaNoi.getAmountOfARoom()==0)
    {
test=1;
    }
    else
    {
        HotelHaNoi.setAmountOfARoom(HotelHaNoi.getAmountOfARoom()-1);
    }  
    }
    else if(customer.getTypeOfRentalRoom().equals("b")||customer.getTypeOfRentalRoom().equals("B"))
    {
       
        if(HotelHaNoi.getAmountOfBRoom()==0)
        {
    test=1;
        }
        else
        {
            HotelHaNoi.setAmountOfARoom(HotelHaNoi.getAmountOfBRoom()-1);
        } 
    }
    else if (customer.getTypeOfRentalRoom().equals("c")||customer.getTypeOfRentalRoom().equals("C"))
    {
        if(HotelHaNoi.getAmountOfCRoom()==0)
    {
test=1;
    } 
    else
    {
        HotelHaNoi.setAmountOfARoom(HotelHaNoi.getAmountOfCRoom()-1);
    } 
    }
  
}while(test==1);
listcustomer.add(customer);
System.out.println("da nhap thong tin thanh cong");
    }
  void ExportCustomerInformation()
  {
    for(int i=0;i<listcustomer.size();i++)
{System.out.println("khach hang "+(i+1));
    listcustomer.get(i).display();
}
  }
}

