/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.io.*;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import javax.swing.Timer;

/**
 *
 * @author 16007873
 */
public class SokobanGame extends JComponent implements ActionListener {

    public static int levelno = 0;                //start on level 0
    JFrame frame = new JFrame();                      //create a frame to add contents to

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }

    SokobanGame() throws FileNotFoundException {              //throws an error if no file is found

        frame.getContentPane().add(new StartMenu(this));          //Calls the StartMenu
//    frame.getContentPane().setBackground(Color.gray);     //sets the background colour to grey

        frame.setSize(780, 500);     // Setting Frame size. This is the window size

        frame.setLayout(null);      // We don't want the default layout manager to be used as we are
        // providing a custom layout using our setBounds calls above.  
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (levelno >= 1 && levelno <= 5) {                  //ensure that the level is valid to the level files
            levelno = levelno + 1;
        } //when button clicked +1 to the level to call a new level
        else {
            levelno = 1;                                      //if level number is out of bounds make it equal to 1
        }
        try {
            Level L = new Level();                //creates a new level
            frame.add(L);                           //adds a new level to the screen
            frame.repaint();

        } catch (FileNotFoundException ex) {             //error message if no file is found
            Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
