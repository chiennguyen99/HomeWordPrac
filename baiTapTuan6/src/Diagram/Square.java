package Diagram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;


public class Square extends Rectangle{
    Square(){}; 
    Square(int local_X, int local_Y, int length){
        this.local_X = local_X; 
        this.local_Y = local_Y; 
        this.length = length; 
        
        this.setSize(local_X+length,local_Y+length);
        this.setLayout(new GridLayout(1,1));
        DrawApperception(this.local_X, this.local_Y, this.length); 
    }
    
    protected void DrawApperception(int local_X, int local_Y, int length){
        super.DrawApperception(local_X, local_Y, length, length);
    }
}
