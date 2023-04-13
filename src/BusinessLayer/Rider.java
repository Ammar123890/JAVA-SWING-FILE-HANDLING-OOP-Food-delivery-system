/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import static BusinessLayer.Customer.getData;
import DataLayer.RiderData;
import java.io.File;
import java.util.ArrayList;

public class Rider extends USER {

//    public static Iterable<Rider> riderArr;
    private String BikeNumber;
    private boolean isBusy=false;

    public boolean isIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public Rider(String BikeNumber, String username, String password, String phoneNumber, String email) {
        super(username, password, phoneNumber, email);
        this.BikeNumber = BikeNumber;
    }

    public Rider(String BikeNumber) {
        this.BikeNumber = BikeNumber;
    }
    
    private String tempCust;
    private String tempRestuarant;
    private String tempAdress;

    public String getTempCust() {
        return tempCust;
    }

    public void setTempCust(String tempCust) {
        this.tempCust = tempCust;
    }

    public String getTempRestuarant() {
        return tempRestuarant;
    }

    public void setTempRestuarant(String tempRestuarant) {
        this.tempRestuarant = tempRestuarant;
    }

    public String getTempAdress() {
        return tempAdress;
    }

    public void setTempAdress(String tempAdress) {
        this.tempAdress = tempAdress;
    }
    

    public Rider() {
       
    }

    public String getBikeNumber() {
        return BikeNumber;
    }

    public void setBikeNumber(String BikeNumber) {
        this.BikeNumber = BikeNumber;
    }
    
    
    //////////////////////////////////////////
    ////////Connecting to Data layer//////////
    //////////////////////////////////////////

    public static void write()
    {
        RiderData.write();
    }
    public static  ArrayList<Rider> getData()
    {
        return RiderData.riderArr;
        
    }
    
          public boolean ActiveCustomers()
      {
          RiderData obj=new RiderData();
          return obj.ActiveCustomers();
        
      }
          
    //////////////////////////////////////////
    ////////////Functionalities///////////////
    //////////////////////////////////////////
      
      public boolean checkRegisteration(String id,String bike)
      {
         for(Rider b:getData())
           {
               if(b.getEmail().equals(id)||b.getBikeNumber().equals(bike))     
                   return true;    
      }
                  return false;
      }
      
      public boolean isBusy(String ID)
      {
              for(Rider r: Rider.getData())
                    if(r.getEmail().equals(ID))       
                      if(r.isIsBusy())
                      return true;
 
                   
                
                
              return false;
      }
      public Rider riderData(String ID)
      {
                  for(Rider r: Rider.getData())
                    if(r.getEmail().equals(ID))       
                      return r;   
                return null;
      }
          
      
      
       public boolean verification(String id)
      {
        for(Rider b:getData())
           {
               if(b.getEmail().equals(id) && 
                    b.isIsBusy()==true) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      

      public boolean CheckAvailability(String id, String pass)
      {
                  for(Rider b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass))     
                   return true;    
      }
                  return false;
          
      }
      
      public boolean verification(String id, String pass)
      {
        for(Rider b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass)) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      
      public boolean AcceptDelivery(String RiderID, String CustomerID,String CustomerName,String Address,String rest_name)
      {
          for(Rider r:Rider.getData())
          {
              if(r.getEmail().equals(RiderID))
              {
                  if(!r.isIsBusy())
                  {
                      for(Customer c:Customer.getData())
                       {
                           if(c.getEmail().equals(CustomerID))
                            {
                                  c.obj.setIsPickedUp(true);
                                  c.obj.setCancel(false);
                                  break;
                            }
                       }
                      r.setIsBusy(true);
                      r.setIsBusy(true);
                      r.setTempCust(CustomerName);
                      r.setTempAdress(Address);
                      r.setTempRestuarant(rest_name);
                      write();
                      
                      
                  }
                  else
                  {
                      return false;
                  }
              }
               
               
          }
          return true;
          
      }
   
    
}

