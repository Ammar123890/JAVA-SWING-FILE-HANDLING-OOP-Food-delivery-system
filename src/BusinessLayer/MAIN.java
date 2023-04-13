/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import DataLayer.RestuarantData;
import DataLayer.RiderData;
import BusinessLayer.Rider;
import DataLayer.CustomerData;
import ControllerLayer.UserTypeGUI;
import java.util.ArrayList;

/**
 *
 * @author syeda
 */
public class MAIN {
        /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     
        CustomerData.read();
        RestuarantData.read_R();
        RiderData.read();
        new UserTypeGUI().setVisible(true);
        CustomerData.write();
        RestuarantData.write_R();
        RiderData.write();
       
       
       
    }
    
}
