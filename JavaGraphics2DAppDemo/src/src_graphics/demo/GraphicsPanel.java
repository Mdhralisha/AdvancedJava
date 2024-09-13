package src_graphics.demo;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class GraphicsPanel extends JPanel {
    public int width = 800;
    public int height = 700;
    public GraphicsPanel(){
        setSize(this.width, this.height);// panel size
        setBackground(Color.BLACK);// panel background color
    }
    @Override
    public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g; // type casting Graphics object to 2D
        // graphics ko object linxa jasko adhar ma draw garinxa
    
        
        
        
  // drawing rectangle
        Rectangle2D r1 = new Rectangle2D.Double(10,20,200,150);
        // posX, posY , width, height
        g2d.draw(r1);// draw the shape
        g2d.setColor(Color.red);// set color of the shape
        g2d.fill(r1);// fill the color of shape
        //anOTHER RECTANGLE ADJACENT TO IT
        Rectangle2D r2 = new Rectangle2D.Double(230, 20, 400, 150);
         // left bata right tira jana x ko value baaudne top dekhi bottom aauna y ko value change garne
        g2d.draw(r2);
        g2d.setColor(Color.blue);
        g2d.fill(r2);

         //drawing ellipse
        Ellipse2D e1 = new Ellipse2D.Double(10, 200, 250, 150);
        g2d.draw(e1);
        g2d.setColor(Color.yellow);
        g2d.fill(e1);
        
        
        
        
        // font ko lagi setFont
        
        
        //Drawing Circle using Ellipse Class
        Ellipse2D e2 = new Ellipse2D.Double(290, 200, 300, 300);
        g2d.draw(e2);
        g2d.setColor(Color.green);
        g2d.fill(e2);
        
        // shape ko border ko color jasto / fateko pixel laii hatauna code google gara
        
        // darwing polygon
        
        Path2D p = new Path2D.Double();
        p.moveTo(10,650);
        p.lineTo(400, 200);
        p.curveTo(10,20,30,40,50,15);
        g2d.draw(p);
        g2d.setColor(Color.gray);
        g2d.fill(p);
        
        
        
        
        
        
        
            
         
        
                
        }


    
    
}
