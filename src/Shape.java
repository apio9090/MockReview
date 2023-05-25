import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adp5384
 */
public abstract class Shape implements Serializable, IShape{
    public Color co;                                                                   //init color
    public Shape s2;                                                                   //create shape obj
    public Boolean isD, isF, isG, isT;
    public File f;
    
    int x, y, h, w, lox, loy, lnx, lny;                                            //initialize variables
    TexturePaint tp;
    BufferedImage buffI;
                              

}
