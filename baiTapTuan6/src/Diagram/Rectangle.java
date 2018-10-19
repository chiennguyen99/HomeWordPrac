package Diagram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Rectangle extends JPanel{
    protected int local_X = 0; 
    protected int local_Y = 0; 
    private int width = 0; 
    protected int length = 0; 

    public int getLocal_X() {
        return local_X;
    }

    public int getLocal_Y() {
        return local_Y;
    }

    public int getLength() {
        return length;
    }
    
    public int getWidthR() {
        return width;
    }
    Rectangle(){}; 
    Rectangle(int local_X, int local_Y, int length, int width){
        this.local_X = local_X; 
        this.local_Y = local_Y; 
        this.width   = width; 
        this.length = length; 
        this.setSize(local_X+length,local_Y+width);
        this.setLayout(new GridLayout(1,1));
        DrawApperception(this.local_X, this.local_Y, this.length, this.width); 
    }
    
    protected void DrawApperception(int local_X, int local_Y, int length, int width){
        JPanel P; 
        P = new JPanel(){
           @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
              
                g.setColor(Color.BLUE);
              
                g.fillRect(local_X, local_Y, length, width);
            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(length, width); 
            }
        };
        this.add(P); 
    }
}
