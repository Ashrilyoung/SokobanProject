/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;



import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.io.*;
import javax.swing.JLayeredPane;



/**
 *
 * @author 16007873
 */


public class SokobanGame extends JComponent{
    
    public static int levelno = 0;
    
    SokobanGame() throws FileNotFoundException{
    
    JFrame frame=new JFrame();  
    
    frame.getContentPane().add(new StartMenu());

    frame.setSize(600,600);     // Setting Frame size. This is the window size
        
    frame.setLayout(null);      // We don't want the default layout manager to be used as we are
                                    // providing a custom layout using our setBounds calls above.  
    frame.setVisible(true);  
     
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLayeredPane gamepanel = new JLayeredPane();
        
    gamepanel.setBounds(0, 60, frame.getWidth(), frame.getHeight());
    frame.add(gamepanel);
       
      
    
    
    for (int i=1; i < 15; i++){
      
    Floor floor = new Floor();
    gamepanel.add(floor, new Integer(0));
    floor.setVisible(true);
    floor.setBounds(i*32, 0, 32, 32);
    
    Crate crate = new Crate();
    gamepanel.add(crate, new Integer(1));
    crate.setVisible(true);
    crate.setBounds(i*64, 0, 32, 32);
    
    WarehouseKeeper keeper = new WarehouseKeeper();
    gamepanel.add(keeper, new Integer(1));
    keeper.setVisible(true);
    keeper.setBounds(i*128, 0, 32, 32);
    
    Wall wall = new Wall();
    gamepanel.add(wall, new Integer(1));
    wall.setVisible(true);
    wall.setBounds(i*256, 0, 32, 32);
    }
    

    
    
}}




