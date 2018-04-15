/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

/**
 *
 * @author 16007873
 */
public class WarehouseKeeper extends MapElement{
    
    
//    private final ImageIcon icon;                 
 
    public WarehouseKeeper()
    {
    super("Resources\\WareHouseKeeper.png");
//    addKeyListener(this);                                                       
//    setFocusable(true);
//    setFocusTraversalKeysEnabled(false);
//    icon = new ImageIcon("Resources\\WareHouseKeeper.png");

    }
    
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    }        
            
            
//    @Override                                                                 //this code was intended for character movement 
//    public void actionPerformed(ActionEvent e){
//
//    }
//    
//
//    public void up(){
////        if (x == cratex + 0 && y == cratey + 32){
////        cratey = cratey - 32;}
////        y = y - 32;
////        x = x + 0;
//        repaint();
//    }
//    
//    public void down(){
//
////        if (x == cratex + 0 && y == cratey-32){
////        cratey = cratey + 32;}
////        y = y + 32;
////        x = x + 0;
//        repaint();
//    }   
//    
//    public void left(){
//
////        if (x == cratex + 32 && y == cratey){
////        cratex = cratex - 32;}
////        y = y + 0;
////        x = x - 32;
//        repaint();
//    } 
//    
//    public void right(){
//
////        if (x == cratex - 32 && y == cratey){
////        cratex = cratex + 32;}
////        y = y + 0;
////        x = x + 32;
//        repaint();
//    } 
//    
//  
//
// 
//    @Override
//    public void keyTyped(KeyEvent e) {
// 
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//    int code = e.getKeyCode();
//    if (code == KeyEvent.VK_UP){
////        crateup();
//        up();
//    }
//     if (code == KeyEvent.VK_DOWN){
////        cratedown();
//        down();
//    }
//    if (code == KeyEvent.VK_LEFT){
////        crateleft();
//        left();
//    }
//    if (code == KeyEvent.VK_RIGHT){
////        crateright();
//        right();
//    }
//  
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//    int code = e.getKeyCode();
//    if (code == KeyEvent.VK_UP){
//
//    }
//     if (code == KeyEvent.VK_DOWN){
//
//    }
//      if (code == KeyEvent.VK_LEFT){
//
//    }
//       if (code == KeyEvent.VK_RIGHT){
//
//    }  
//    }
//
//
}


