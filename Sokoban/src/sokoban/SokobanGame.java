/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;



import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.io.*;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;



/**
 *
 * @author 16007873
 */


public class SokobanGame extends JComponent implements ActionListener{
   
    public static int levelno = 0;                //start on level 0
    JFrame frame=new JFrame();                      //create a frame to add contents to
    
    SokobanGame() throws FileNotFoundException{              //throws an error if no file is found
    
    
    frame.getContentPane().add(new StartMenu(this));          //Calls the StartMenu
//    frame.getContentPane().setBackground(Color.gray);     //sets the background colour to grey

    frame.setSize(800,600);     // Setting Frame size. This is the window size
        
    frame.setLayout(null);      // We don't want the default layout manager to be used as we are
                                    // providing a custom layout using our setBounds calls above.  
    frame.setVisible(true);  
     
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    validate();
    repaint();
    
   
//    JLayeredPane gamepanel = new JLayeredPane();                                    //This code is to test whether or not pictures display properly.
//    gamepanel.setBounds(0, 60, frame.getWidth(), frame.getHeight());
//    frame.add(gamepanel);
//
//    for (int i=1; i < 15; i++){                                                       //the code will loop through 15 times
//      
//    Floor floor = new Floor();                                                        //calls the floor class to insert a picture
//    gamepanel.add(floor, new Integer(0));
//    floor.setVisible(true);
//    floor.setBounds(i*32, 0, 32, 32);
//    
//    
//    Crate crate = new Crate();                                       //calls the Crate class to insert a Crate
//    gamepanel.add(crate, new Integer(1));
//    crate.setVisible(true);
//    crate.setBounds(i*64, 0, 32, 32);
//
//    
//    WarehouseKeeper keeper = new WarehouseKeeper();        //calls the WareHouseKeeper class to insert the PlayerModel
//    gamepanel.add(keeper, new Integer(1));
//    keeper.setVisible(true);
//    keeper.setBounds(i*128, 0, 32, 32);
//    
//    Wall wall = new Wall();                                 //calls the Wall class to insert a picture
//    gamepanel.add(wall, new Integer(1));
//    wall.setVisible(true);
//    wall.setBounds(i*256, 0, 32, 32);
//
//    }
    
   
    
}
    @Override
     public void actionPerformed(ActionEvent ae)
     {
        if (levelno >= 1 && levelno <=5){                  //ensure that the level is valid to the level files
                levelno = levelno + 1;}                              //when button clicked +1 to the level to call a new level
                else levelno = 1;                                      //if level number is out of bounds make it equal to 1
                try {
//                        JLayeredPane gamepanel = new JLayeredPane();                                    //This code is to test whether or not pictures display properly.
//                        gamepanel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
//                        frame.add(gamepanel);
                        frame.getContentPane().add(new Level()); 
//                        gamepanel.add(new Level());                     //call the level class
//                        revalidate();                          //redraw the screen
//                        repaint();
                    
                } catch (FileNotFoundException ex) {             //error message if no file is found
                    Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } 
        validate();
        repaint();
     }

     
}





