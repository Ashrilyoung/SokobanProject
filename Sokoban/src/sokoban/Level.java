/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

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

    private MapElement map[][];                   //2d array to hold crate locations
    private final char wall = 'X';                    //character variables
    private final char staticfloor = ' ';
    private final char Crate = '*';
    private final char Diamond = '.';
    private final char WarehouseKeeper = '@';
    private final char lineEnd = 'e';
//    
//    private int levelWidth;                     
//    private int levelHeight;                    
//    private int numberOfCrates;

    private int Ycoord = 0;                          //y coordinate of picture being placed on the screen
    private int Xcoord = 32;                          //x coordinate of picture being placed on the screen

    public Level() throws FileNotFoundException {

        setBounds(-32, 60, 780, 500);               //panel location and dimensions
        setVisible(true);
        setLayout(null);                           //allows the images to be placed in an exact location

        int[][] Map = new int[23][16];

        Scanner map = new Scanner(new File("Resources\\level" + levelno + ".txt"));     //scans in a txt document with this filepath
//    
//    
//    levelWidth = map.nextInt();
//    levelHeight = map.nextInt();
//    numberOfCrates = map.nextInt();

        while (map.hasNext()) {                                                //while there are still characters loop
            String str = map.nextLine();                                     //string equal to next line of txt document
            char[] elements = str.toCharArray();                          //convert string to array of characters
            System.out.println(elements);
            for (int i = 0; i < elements.length; i++) {

                if (lineEnd == elements[i]) {                           //if variable is equal to character i draw wall at this coordinate

                    Ycoord = Ycoord + 32;                                    //at the end of a line add to the y coordinate so it displays on the next row
                    Xcoord = 0;                                              //at the end of a line make the x coordinate 0

                }

                Xcoord = Xcoord + 32;

                if (wall == elements[i]) {                                    //if variable is equal to character i draw wall at this coordinate
                    Wall statickwall = new Wall();
                    statickwall.setBounds(Xcoord, Ycoord, 32, 32);              //location and size of the object
                    this.add(statickwall);
                    statickwall.setVisible(true);

                } else if (Crate == elements[i]) {                            //if variable is equal to character i draw wall at this coordinate
                    Crate MoveCrate = new Crate();
                    MoveCrate.setBounds(Xcoord, Ycoord, 32, 32);        //location and size of the object
                    MoveCrate.setVisible(true);
                    add(MoveCrate);

                } else if (Diamond == elements[i]) {                            //if variable is equal to character i draw wall at this coordinate
                    Diamond DiamondObjective = new Diamond();
                    DiamondObjective.setBounds(Xcoord, Ycoord, 32, 32);                //location and size of the object
                    DiamondObjective.setVisible(true);
                    add(DiamondObjective);

                } else if (WarehouseKeeper == elements[i]) {                            //if variable is equal to character i draw wall at this coordinate
                    WarehouseKeeper WarehouseKeeper = new WarehouseKeeper();
                    WarehouseKeeper.setBounds(Xcoord, Ycoord, 32, 32);                //location and size of the object
                    WarehouseKeeper.setVisible(true);
                    add(WarehouseKeeper);

                } else if (staticfloor == elements[i]) {
                    Floor floor = new Floor();                                          //if no character draw floor picture
                    add(floor);
                    floor.setBounds(Xcoord, Ycoord, 32, 32);                            //location and size of the object
                    floor.setVisible(true);

                }
            }

        }

    }

}
