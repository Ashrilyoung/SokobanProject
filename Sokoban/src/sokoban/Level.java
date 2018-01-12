/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JPanel;
import static sokoban.SokobanGame.levelno;

/**
 *
 * @author 16007873
 */
public class Level extends JPanel {
    
    public String Map[][];   

    

    
    public Level() throws FileNotFoundException{
    Scanner map = new Scanner(new File("Resources\\level"+levelno+".txt"));
    while (map.hasNext()){
        String str = map.nextLine();
        System.out.println(str); 
        str.toCharArray();
        System.out.println(str);
    
    } 
    
    setBounds(0,0,600, 600);
    setVisible(true);
        
 
    
}}

