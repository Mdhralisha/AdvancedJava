/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel title;
    JButton button;
    
    public MouseListenerExample(){
        
        setTitle("MouseListener Example");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,250);
        
        title = new JLabel("MouseListner Example");
        title.setBounds(20,20,200,50);
        
        button = new JButton();
        button.setText("Do Action");
        button.setBounds(20, 70, 200, 50);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        
        
        
        add(title);
        add(button);
        
        button.addMouseListener(this);
        
    }
    
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseListenerExample().setVisible(true);
              
            }
        });
    }
    
    
   
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("I am button and I am clicked");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.button.setSize(250,90);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.button.setSize(200,50);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.button.setBackground(Color.red);
        this.button.setForeground(Color.white);
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.button.setBackground(Color.GRAY);
        this.button.setForeground(Color.WHITE);
       
        
       
    }
    
    
}
