
import java.awt.BasicStroke;
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
public class Text extends Shape implements IText{    
    public String text;
    public void drawDashed(Graphics2D g2d, BasicStroke bs){
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        g2d.drawString(text, lnx, lny);                                           //draw text
        s2 = new Text();                                                        //remake object  
    }

    @Override
    public void draw(Graphics2D g2d, BasicStroke bs) {
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        g2d.drawString(text, lnx, lny);                                           //draw text  
        s2 = new Text();                                                        //remake object  
   }

   
    
}
