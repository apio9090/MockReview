
import java.awt.BasicStroke;
import java.awt.Color;
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
public class Erase extends Shape{
    public void drawDashed(Graphics2D g2d, BasicStroke bs){        
        g2d.setColor(new Color(214,217,223));                                                         //set color
        g2d.setStroke(bs);                                                      //set stroke
        g2d.drawLine(lox,loy,lnx,lny);                                            //draw line 
        s2 = new Erase();                                                        //remake rect object
    }

    @Override
    public void draw(Graphics2D g2d, BasicStroke bs) {        
        g2d.setColor(new Color(214,217,223));                                                         //set color
        g2d.setStroke(bs);                                                      //set stroke
        g2d.drawLine(lox,loy,lnx,lny);                                            //draw line 
        s2 = new Erase();                                                        //remake rect object
    }

    
}
