
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adp5384
 */
public class RoundRect extends Shape {

    public void drawDashed(Graphics2D g2d, BasicStroke bs) {
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        g2d.setStroke(bs);                                                      //set stroke
        if (isF) {
            g2d.fillRoundRect(x, y, w, h, h / 2, h / 2);                                  //draw round rect
        } else {
            g2d.drawRoundRect(x, y, w, h, h / 2, h / 2);                                  //draw round rect
        }
        s2 = new RoundRect();                                                   //make new rr object        
    }

    @Override
    public void draw(Graphics2D g2d, BasicStroke bs) {
        if (!isG) {
            g2d.setColor(co);                                                         //set color            
        }
        if (isT) {
            BufferedImage buffI = null;
            try {
                buffI = ImageIO.read(f);
            } catch (IOException ex) {
                Logger.getLogger(Rect.class.getName()).log(Level.SEVERE, null, ex);
            }
            Rectangle rec = new Rectangle(x, y, w, h);
            TexturePaint tp = new TexturePaint(buffI, rec);
            g2d.setPaint(tp);
            g2d.fillRoundRect(x, y, w, h, h / 2, h / 2);
        }
        g2d.setStroke(bs);                                                      //set stroke
        if (isF) {
            g2d.fillRoundRect(x, y, w, h, h / 2, h / 2);                                  //draw round rect
        } else {
            g2d.drawRoundRect(x, y, w, h, h / 2, h / 2);                                  //draw round rect
        }
        s2 = new RoundRect();
        //make new rr object  
    }

}
