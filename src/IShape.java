import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;

public interface IShape  { 
    public abstract void draw(Graphics2D g2d, BasicStroke bs);                                                //abstract draw
    public abstract void drawDashed(Graphics2D g2d, BasicStroke bs); 
}