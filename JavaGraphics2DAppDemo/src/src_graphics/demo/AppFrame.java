/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src_graphics.demo;

import javax.swing.JFrame;

// shape haru draw garna laii 2d ma
public class AppFrame extends JFrame{
    //size of the frame
    public int WIDTH = 800;
     public int HEIGHT = 700;
     public int posX = 350;
     public int posY =100;
    //constructor
    public AppFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//close the frame
        setBounds(this.posX, this.posY, this.WIDTH, this.HEIGHT);
        // framesize with position x and y
        setTitle("Graphics 2D Demo App");// frame title
        setResizable(false);// disable the frame resize property
        // we should add components before displaying the frame
        add(new GraphicsPanel());
        setVisible(true); // display the frame
    }
    public static void main(String args[]){
        new AppFrame();
        
    }
    
}
