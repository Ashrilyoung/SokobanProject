/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;



import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.io.*;



/**
 *
 * @author 16007873
 */
public class SokobanGame extends JComponent{
    
    SokobanGame() throws FileNotFoundException{
    
     JFrame frame=new JFrame();  
    
     frame.getContentPane().add(new StartMenu());

     frame.setSize(600,600);     // Setting Frame size. This is the window size
        
     frame.setLayout(null);      // We don't want the default layout manager to be used as we are
                                    // providing a custom layout using our setBounds calls above.  
     frame.setVisible(true);  
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      
    

     
    
}}




