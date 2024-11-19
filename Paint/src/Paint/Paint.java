/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import javax.swing.JFrame;

/**
 *
 * @author COMPUMARTS
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Mypanel p=new Mypanel();
      JFrame f=new JFrame();
      f.setDefaultCloseOperation(3);
      f.setContentPane(p);
      f.setVisible(true);
      f.setSize(1000, 1000);
      f.setTitle("Paint Program");
        
    }
    
}
