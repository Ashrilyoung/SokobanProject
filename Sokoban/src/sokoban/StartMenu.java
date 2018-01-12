/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

 
import javax.swing.JButton; 
import javax.swing.JPanel; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import static sokoban.SokobanGame.levelno;
 

/**
 *
 * @author 16007873
 */
public class StartMenu extends JPanel implements ActionListener{
    
     
    
    public StartMenu() throws FileNotFoundException{
        
        
     //intended to be contents of start menu
        setBounds(0,0,600, 60);
        setVisible(true);
       
        

        
        JButton startButton = new JButton("Next Level");
        startButton.setBounds(50,50,200, 50); 
        startButton.setVisible(true);
        add(startButton);

        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (levelno >= 1 && levelno <=5){
                levelno = levelno + 1;}
                else levelno = 1;
                try {
                    new Level();
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
        JButton exitButton = new JButton("Exit Game");
        exitButton.setBounds(300,50,200, 50); 
        exitButton.setVisible(true);
        add(exitButton);

        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
             System.exit(0);
            }
        }
        
        );
        
    //contents of start menu


}

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        // In this overridden (that's an important word in OOP) method of
        // ActionListener we are just telling the object to make itself visible.
        
       
        
  
    }



}



