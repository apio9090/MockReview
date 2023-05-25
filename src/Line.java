
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adp5384
 */
public class Line extends Shape{
    public void drawDashed(Graphics2D g2d, BasicStroke bs){
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        g2d.setStroke(bs);                                                      //set stroke
        g2d.drawLine(lox,loy,lnx,lny);                                            //draw line        
        s2 = new Line();                                                        //remake object        
    }

    @Override
    public void draw(Graphics2D g2d, BasicStroke bs) {
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        g2d.setStroke(bs);                                                      //set stroke
        g2d.drawLine(lox,loy,lnx,lny);                                            //draw line        
        s2 = new Line();                                                        //remake object        
    }


}
