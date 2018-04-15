/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 16007873
 */
public class MapElement extends JPanel{
    
   
    private BufferedImage image;           //allows an image to be read and stored
    

    

    public MapElement(String Filepath) {            //filepath will be filled in by calling in a class that inherits from this class
           
        
    
         try 
       {   
           
          image = ImageIO.read(new File(Filepath));                 //load image with this filepath
         
          
       } 
       catch (IOException ex) 
       {
           System.out.println("Exception thrown in ImagePanel: " + ex.getMessage());    //if no image found display error
       }
       validate();
       repaint();
       
    }
      
       
    @Override
    public void paint (Graphics g)
    {
       super.paintComponent(g);                                    //override graphics class 
       g.drawImage(image, 0,0, this);

      
      
    }  
    
       
       
    }
    


