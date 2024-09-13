/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src_board;

import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class GamePanel extends JPanel {
    
    public static int GAMEP_WIDTH =800;
    public static int GAMEP_HEIGHT= 600;
    public static int GAMEP_X= 0;
    public static int GAMEP_Y= 150;
    public int boardRows;
    public int boardHeight;
    public int cellSize;
      
      
      public GamePanel(){
          setBounds(GAMEP_X,GAMEP_Y, GAMEP_WIDTH, GAMEP_HEIGHT);
          
          
      }
            
    
}
