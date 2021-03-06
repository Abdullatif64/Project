package core;

import interfaces.Color;
import interfaces.Pixel;
import interfaces.RGBColor;


public class RGBPixelImpl implements Pixel{

    @Override
    public void setColor(Color color) {
        if(color instanceof RGBColor )
        rgb=(RGBColor)color;
    }

    @Override
    public int compareTo(Pixel o) {
          return this.getColor().compareTo(o.getColor());
         
    }
    
    public RGBColor rgb;


    public RGBPixelImpl(RGBColor rgb) {
        
    }
    public RGBPixelImpl(RGBPixelImpl cp) {
        
    }
    
       
    public String toString(){
        return String.format("(%s)",rgb);
    }

    @Override
    public Color getColor() {
        return rgb;
    }

    
    
}
