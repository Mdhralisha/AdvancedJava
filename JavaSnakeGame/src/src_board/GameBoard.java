/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src_board;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DELL
 */
public class GameBoard extends JFrame implements ActionListener {
    public int boardW= 800; 
    public int boardH= 700;
     public int boardX= 350;
      public int boardY= 50;
      
      public GameBoard(){
          setTitle("Snake Board Game");
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setBounds(this.boardX, this.boardY, this.boardW, this.boardH);
          setBackground(Color.BLUE);
          setResizable(false);
          setLayout(null);
 // adding button panel
          add(new ButtonPanel());
          add(new GamePanel());
          setVisible(true);
      }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public static void main(String args[]){
        new GameBoard();
    }
        
    
}
