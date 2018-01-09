/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 16007873
 */
public class Level {
    
    public Level() throws FileNotFoundException{
    Scanner map = new Scanner(new File("Resources\\level1.txt"));
    while (map.hasNext()){
    String str = map.nextLine();
    System.out.println(str);  } 
}}
