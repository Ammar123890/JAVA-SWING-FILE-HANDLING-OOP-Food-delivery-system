/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import DataLayer.AdminData;
import java.io.Serializable;

public class admin implements Serializable {
    AdminData obj=new AdminData();
    
    //////////////////////////////////////////
    ////////Connecting to Data Layer /////////
    //////////////////////////////////////////
    
    private final String Email=obj.getEmail();
    private final String password=obj.getPass();

    public admin() {
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }
    
    
    //////////////////////////////////////////
    ////////////Functionalities///////////////
    //////////////////////////////////////////
    
    public boolean validation(String email, String Password)
    {
        if(email.equals(Email)&&Password.equals(password))
        return true;
        return false;
      
    }
   
    public boolean acceptRestaurant(String ID)
    {
      restaurant rest_obj=new restaurant();
      for(restaurant r:rest_obj.getData())
        {
            if(r.getEmail().equals(ID))
            {
                r. setStatus(true);
                restaurant.write_R();
                return true;
            }
        }
      return false;
    }
    public boolean acceptCustomer(String ID)
    {
       for(Customer r:Customer.getData())
        {
            if(r.getEmail().equals(ID))
            {
                r. setStatus(true);
                Customer.write();
                return true;
            }
        }
       return false;
    }
    

  
}
