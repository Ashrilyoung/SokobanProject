/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

 
import javax.swing.JButton; 
import javax.swing.JPanel; 
import javax.swing.JComponent; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 

/**
 *
 * @author 16007873
 */
public class StartMenu extends JPanel implements ActionListener{
    
     
    
    public StartMenu() throws FileNotFoundException{
        
        
     //intended to be contents of start menu
        setBounds(0,0,600, 600);
        setVisible(true);
     
        
        JButton startButton = new JButton("Start Game");
        startButton.setBounds(50,50,200, 50); 
        startButton.setVisible(true);
        add(startButton);


        
        JButton exitButton = new JButton("Exit Game");
        exitButton.setBounds(300,50,200, 50); 
        exitButton.setVisible(true);
        add(exitButton);
        
        
        Scanner map = new Scanner(new File("Resources\\level1.txt"));
        while (map.hasNext()){
        String str = map.nextLine();
        System.out.println(str);  } 
    //contents of start menu
 
       
}

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        // In this overridden (that's an important word in OOP) method of
        // ActionListener we are just telling the object to make itself visible.
        
        this.setVisible(true); 
        
  
    }



}



