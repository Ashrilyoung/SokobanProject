/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import static sokoban.SokobanGame.levelno;

/**
 *
 * @author 16007873
 */
public class Level extends JPanel {
    
    private String Map[][];                    //2d array to hold map data
    private String Crates[][];                   //2d array to hold crate locations
    private char wall = 'X';                    //character variables
    private char Crate = '*'; 
    private char Diamond = '.'; 
    private char WarehouseKeeper = '@';
    private char lineEnd = 'e';
    private int Ycoord = 0;
    private int Xcoord = 32;
    
    public Level()throws FileNotFoundException{

    setBounds(0,60,800, 600);               //panel location and dimensions
    setVisible(true); 
    setLayout(null); 

    Scanner map = new Scanner(new File("Resources\\level"+levelno+".txt"));     //scans in a txt document with this filepath
    while (map.hasNext()){                                                //while there are still characters loop
        String str = map.nextLine();                                     //string equal to next line of txt document
        char[] elements = str.toCharArray();                          //convert string to array of characters
        System.out.println(elements);
        for(int i=0; i < elements.length; i++) {
            
        validate();
        repaint();
            
            if (lineEnd == elements[i]){                           //if variable is equal to character i draw wall at this coordinate
            
            Ycoord = Ycoord + 32;
            Xcoord = 0;
            
            }
                                      
            Xcoord = Xcoord +32;
            
            
            if(wall == elements[i]){                            //if variable is equal to character i draw wall at this coordinate
                Wall statickwall = new Wall();
                statickwall.setBounds(Xcoord, Ycoord, 32, 32);
                this.add(statickwall);
                statickwall.setVisible(true);
                
            }else if(Crate == elements[i]){                            //if variable is equal to character i draw wall at this coordinate
                Crate MoveCrate = new Crate();
                MoveCrate.setBounds(Xcoord, Ycoord, 32, 32);
                MoveCrate.setVisible(true);
                add(MoveCrate);
                
            }else if(Diamond == elements[i]){                            //if variable is equal to character i draw wall at this coordinate
                Diamond DiamondObjective = new Diamond(); 
                DiamondObjective.setBounds(Xcoord, Ycoord, 32, 32);                
                DiamondObjective.setVisible(true);
                add(DiamondObjective);
                
            }else if(WarehouseKeeper == elements[i]){                            //if variable is equal to character i draw wall at this coordinate
                WarehouseKeeper WarehouseKeeper = new WarehouseKeeper();
                WarehouseKeeper.setBounds(Xcoord, Ycoord, 32, 32);                
                WarehouseKeeper.setVisible(true);
                add(WarehouseKeeper);
                
            }else{  
                
                Floor floor = new Floor();               //if no character draw floor picture
                add(floor, new Integer(0));
                floor.setBounds(Xcoord, Ycoord, 32, 32);   
                floor.setVisible(true);
            }
            validate();
            repaint();
    }
   
    
    } 


 
    
}


}

