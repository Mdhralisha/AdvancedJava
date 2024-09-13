/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src_board;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class ButtonPanel extends JPanel {
    public int panelW = 800;
    public int panelH = 150;
    public int panelX = 0;
    public int panelY =0;
    public JButton start;
    
    public ButtonPanel(){
        setBounds(this.panelX, this.panelY, this.panelW, this.panelH);
        start = new JButton("Start");
        start.setBounds(this.panelX+250, this.panelY, this.panelW, this.panelH);
        start.setBackground(Color.RED);
        start.setForeground(Color.WHITE);
        add(start);
        
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Clicked");
        System.out.println("Game panel Width:"+GamePanel.GAMEP_WIDTH);
        System.out.println("Game panel Height:"+ GamePanel.GAMEP_HEIGHT);
        
    }
            
    
}
