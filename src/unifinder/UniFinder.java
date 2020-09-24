/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifinder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.nio.file.Files.size;
import javax.swing.JFrame;

/**
 *
 * @author afraza
 */
public class UniFinder {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        // TODO code application logic here
       /*JFrame ob=new JFrame();
       int width=700;
        int height=600;
        ob.setBounds(300, 100, width, height);       
        ob.setVisible(true);
        ob.setBackground(Color.black);
       */
       Login obj=new Login();
        obj.setVisible(true);
     
}
 
        private void LogInActionPerformed(java.awt.event.ActionEvent evt){
           //obj.setVisible(true);
            
        }
}
