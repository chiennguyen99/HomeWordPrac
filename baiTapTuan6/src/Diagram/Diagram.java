package Diagram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Diagram extends JFrame{
        
    public static void main(String[] args) {
        
        JFrame MainGrap = new JFrame("bai tap tuan 6"); 
        
//        drawPolygon P  = new drawPolygon(4, 100, 100,100);
//        
//        drawPolygon P1 = new drawPolygon(4, 300, 100, 100); 
//        
//        Rectangle   Rec = new Rectangle(400, 100, 200, 100); 
//        
//        Square      Sq  = new Square(600, 100, 100); 
//        
//        Circle      Cr = new Circle(700, 100, 100); 
//        
//        MainGrap.add(P); 
//        
//        MainGrap.add(P1); 
//        
////        MainGrap.remove(Cr);
//        
//        MainGrap.add(Rec); 
//        
//        MainGrap.add(Sq); 
//        
//        MainGrap.add(Cr); 
//        
//        MainGrap.remove(Cr);
        
        Leyer L = new Leyer(1500, 500); 
        
        L.addRectangle(5);
              
        MainGrap.add(L); 
        
        MainGrap.setSize(1000, 500);
        
        MainGrap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainGrap.setVisible(true);
       
    }
    
    private void initComponents(){
        
//        P1.setSize(20,20);^
        
        JPanel P2; 
        
        P2 = new JPanel(){
            
            @Override
            
            protected void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                
                g.setColor(Color.BLUE);
                
                g.fillRect(0, 0, 50, 50);
                
            }
        };   
        this.add(P2); 
    }
    
    public Diagram(){
        
        this.setSize(400,400);
        
        this.setLayout(new GridLayout(1,1));
       
        initComponents(); 
        
    }
}
