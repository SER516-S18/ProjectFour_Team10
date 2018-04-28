package client.service;

import javax.swing.*;

/**
 * @author Group10
 * @version 1.0
 * MessageBox class 
 */
public class MessageBox {
     
     /**
      * windowPop Method
      * @param message: Message to display
      */
    public void windowPop(String message){
    	String msgLevel = "alert";
        JOptionPane.showMessageDialog(null, message,
        			msgLevel, JOptionPane.ERROR_MESSAGE);
    }
}
