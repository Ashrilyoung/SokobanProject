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
public class StartMenu extends JPanel {

    public StartMenu(SokobanGame menuAction) throws FileNotFoundException {

        //intended to be contents of start menu
        setBounds(0, 0, 600, 60);                //size of start menu
        setVisible(true);

        JButton startButton = new JButton("Next Level");      //button saying Next Level which starts game
        startButton.setBounds(50, 50, 200, 50);
        startButton.setVisible(true);
        add(startButton);

        startButton.addActionListener(menuAction);

        JButton exitButton = new JButton("Exit Game");          //button saying Exit Game
        exitButton.setBounds(300, 50, 200, 50);
        exitButton.setVisible(true);
        add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);                                   // When exit game button clicked exit the program
            }
        });

        revalidate();
        repaint();

        //contents of start menu
    }

}
