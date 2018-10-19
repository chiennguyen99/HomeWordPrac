package Diagram;

import java.awt.GridLayout;
import javax.swing.JPanel;


public class Leyer extends JPanel{
    private int size_Width  = 0; 
    private int size_Length = 0;
    private Rectangle[] Rec; 
    
    Leyer(int size_Width, int size_Length){
        this.size_Width = size_Width; 
        this.size_Length = size_Length; 
        this.setSize(size_Width, size_Length);
        this.setLayout(new GridLayout(1,1));
    }
    
    void addRectangle(int n){
        int t = 0; 
        for (int i = 0; i < n; i++){
            Rec[i] = new Rectangle(t, 0, 200, 100); 
            t = t + 200; 
            this.add(Rec[i]); 
        }
    }
    
    void addSquare(int local_X, int local_Y, int length){
        Square Sq = new Square(local_X, local_Y, length); 
        this.add(Sq); 
    }
    
}
