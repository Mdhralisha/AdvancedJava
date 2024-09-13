/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// lAB 6
package examples;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


// events 
// action listener for components such as button label 
//only one method in action listener i.e action performed
// key listener used in input field as as text field text area password field
// 3 methods 
// mouse listener mouse events such as mouse click, mouse drag, mouse hover 

/**
 *
 * @author DELL
 */
public class KeyListenerExample extends JFrame implements KeyListener{
      String input_message ="";
      JLabel lbl_message, output;
    
    public KeyListenerExample(){
        
      
        setTitle("Key Listener Example");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,400,600);
        
        
         lbl_message = new JLabel("Type your message here..");
        lbl_message.setBounds(20,10,300,20);
        
        
        //JTextField text_message = new JTextField("type here!!");
        //text_message.setBounds(20, 350, 300, 40);
        
        JTextArea message = new JTextArea();
        message.setBounds(20, 40, 300, 300);
        
        output= new JLabel("No Event");
        output.setBounds(20,400,300,20);
        
        
        
        //event 
        
        message.addKeyListener(this);// this le JfRAME KO VANERA REPRESENT GARXA
        add(lbl_message);
        add(message);
        add(output);
        //add(text_message);
    }
    
    
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {// incokelater swing utilities ko method ho
            @Override
            public void run() {
               new KeyListenerExample().setVisible(true);
            }
        });
        
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Something is typing......");
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.input_message += e.getKeyChar();
        this.setOutput(input_message);
       System.out.println("Key is pressed......");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key is Released......");
       
    }

    private void setOutput(String data) {
      this.output.setText(data);
    }

   
    
}
