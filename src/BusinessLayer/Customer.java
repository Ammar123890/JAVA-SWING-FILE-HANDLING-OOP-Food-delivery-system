/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;



import BusinessLayer.MAIN;
import BusinessLayer.Orders;
import DataLayer.CustomerData;
import ControllerLayer.CustomerHomepageGUI;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ammar
 */


public class Customer extends USER{
    public Customer() {
    }
    private String address;
    private boolean status=false;
    public Orders obj;
    public ArrayList<Orders> orders;
    

    public Customer(String address, String username, String password, String phoneNumber, String email) {
        super(username, password, phoneNumber, email);
        this.address = address;
       orders=new ArrayList<Orders>();
       obj=new Orders();
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getEmail() {
        return email;
    }
     
    //////////////////////////////////////////
    ////////Connecting to Data layer//////////
    //////////////////////////////////////////
    
       public static void read()
    { 
         CustomerData obj=new CustomerData();
         obj.read();
    }
      
      public static void write()
      {
          CustomerData obj=new CustomerData();
         obj.write();
      
      }
      
      public static ArrayList<Customer> getData()
      {
          return CustomerData.customer;
      }
      
      public boolean ActiveCustomers()
      {
          CustomerData obj=new CustomerData();
          return obj.ActiveCustomers();
      }
  
    //////////////////////////////////////////
    ////////////Functionalities///////////////
    //////////////////////////////////////////
      
   
      
      public void placeOrder(String EmailID, Orders obj)
      {
        for(Customer cust:getData())
           {   
               if(cust.getEmail().equals(EmailID))
                {
                    cust.orders.add(obj);
                    cust.obj.setFlag(false);
                }
           }
      }
      
      public boolean OrderNoMoreThenOnce(String CustomerID)
      {
        for(Customer a:getData())
           {   
               if(a.getEmail().equals(CustomerID))
                {
                   if(a.obj.isFlag())
                       return true;
                   else
                       return false; 
                }
           }
            return false;   
      }
      

      
      public boolean orderStatus(String CustomerID)
      {
                  for(Customer a:getData())
           {   
               if(a.getEmail().equals(CustomerID))
               {
                   if(a.obj.isFlag())
                   {
                       return false; 
  
                   }
                   else
                   {
                       return true;
                   }
               }
           }
                  return false;
      }
      
      
      public boolean checkRegisteration(String id)
      {
         for(Customer b:getData())
           {
               if(b.getEmail().equals(id))     
                   return true;    
      }
                  return false;
      }
      
       public boolean verification(String id)
      {
        for(Customer b:getData())
           {
               if(b.getEmail().equals(id) && 
                    b.isStatus()==true) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      

      public boolean CheckAvailability(String id, String pass)
      {
                  for(Customer b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass))     
                   return true;    
      }
                  return false;
          
      }
      
      public boolean verification(String id, String pass)
      {
        for(Customer b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass)&&b.isStatus()==true) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      
     public boolean cancelOrder(String ID)
     {
        for(Customer c:getData())
           {
               if(c.getEmail().equals(ID))
               {
                   for(int i=0;i<c.orders.size();i++)
                   {
                       if(c.obj.isCancel()==false)
                           return false;
                       else
                       {
                           c.obj.setFlag(true);
                           c.orders.remove(i);
                           Customer.write();
                           return true;
                           
                       }
                   }
               }
               
           }  
        return false;
     }
     public boolean trackOrder(String ID)
     {
         for(Customer c:Customer.getData())
        
           if(c.getEmail().equals(ID))
           
              if(c.obj.isCancel()==false)
              
                  return true;
         return false; 
        
     }
      
      

      public void order()
      {
          
      }
      
      

      
  
   
}
