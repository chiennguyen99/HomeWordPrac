package Diagram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Circle extends JPanel 
{
    private int radius = 0; 
    private int local_X = 0; 
    private int local_Y = 0;
    
    public int getRadius() {
        return radius;
    }

    public int getLocal_X() {
        return local_X;
    }

    public int getLocal_Y() {
        return local_Y;
    }
    
    public Circle(int local_X, int local_Y, int radius){
        this.local_X = local_X; 
        this.local_Y = local_Y; 
        this.radius = radius; 
        this.setSize(this.radius + local_X, this.radius + local_Y);
        this.setLayout(new GridLayout(1,1));
        DrawCircle(); 
    }
    
    public void DrawCircle(){
        JPanel P; 
        P = new JPanel(){
           @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(local_X, local_Y, radius, radius);
            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(radius, radius); 
            }
        };
        P.setSize(radius, radius);
        this.add(P); 
    }
    
    public static void main(String[] args){
       
        JFrame P1 = new JFrame("Cricle"); 
        
        Circle cr = new Circle(50, 50, 50); 
        
        P1.add(cr); 
        
        P1.setSize(400, 400);
        
        P1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        P1.setVisible(true);
    }
       
}

