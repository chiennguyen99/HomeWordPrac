package Diagram;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;

import java.awt.GridLayout;

import java.awt.Polygon;

import javax.swing.JPanel;

public class drawPolygon extends JPanel{
    int local_X = 0; 
    int local_Y = 0; 
    int n_polygon = 0; 
    int size = 0; 
    

    public int getLocal_X() {
        return local_X;
    }

    public int getLocal_Y() {
        return local_Y;
    }

    public int getN_Polygon() {
        return n_polygon;
    }
    drawPolygon(int n_polygon, int local_X, int local_Y, int size){
        this.n_polygon = n_polygon; 
        this.local_X   = local_X; 
        this.local_Y   = local_Y; 
        this.size      = size; 
        if (n_polygon == 3){
            this.setSize(local_X + size/2, (int)(local_Y - Math.sqrt(3)*size/3 + size));
        }
        else if (n_polygon > 3){
            this.setSize(local_X + size, local_Y + size);
        }
        
        this.setLayout(new GridLayout(1,1));
        
        drawPolygon(); 
    }
    
    void drawPolygon(){

        JPanel P; 
        P = new JPanel(){
           
           @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Polygon P1 = new Polygon(); 
                if (n_polygon == 3){
                    P1.addPoint(local_X, (int)(local_Y - Math.sqrt(3)*size/3));
                
                    P1.addPoint((int)(local_X + size/2), (int)(local_Y + Math.sqrt(3)*size/6));

                    P1.addPoint((int)(local_X - size/2), (int)(local_Y + Math.sqrt(3)*size/6));
                }
                if (n_polygon > 3){
                    for (int i = 0; i < n_polygon; i++) {
                        P1.addPoint((int) (local_X + size * Math.cos(i * 2 * Math.PI / n_polygon)), (int) (local_Y + size * Math.sin(i * 2 * Math.PI / n_polygon)));
                    }
                }
 
                g.setColor(Color.red);

                g.fillPolygon(P1);
            }
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(size, size); 
//            }
        };
       
        this.add(P); 
    }
}
