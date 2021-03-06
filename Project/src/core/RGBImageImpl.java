package core;
import interfaces.Pixel;
import interfaces.RGBImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RGBImageImpl   extends ImageImpl implements RGBImage {

   

    @Override
    public void randomize() {
   for (int i=0;i<getHeight();i++){
               for (int j=0;j<getWidth();j++){
                  
                   img[i][j]= new RGBPixelImpl(new RGBColorImpl(
                           (byte)(Math.random()*maxColor),
                           (byte)(Math.random()*maxColor), 
                           (byte)(Math.random()*maxColor))); 
                    }}}
    
    private Pixel [][]  img ;
    
    private int maxColor = 255;
    
    public RGBImageImpl(int width, int height, String name) {
        super(width, height, name);
        img = new RGBPixelImpl[height][width];
    }
    
    public RGBImageImpl(RGBImageImpl im) {
        super(im.getWidth(),im.getHeight(),im.getName());
        img = new RGBPixelImpl[im.getHeight()][im.getWidth()];
        img = im.getImg();
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(RGBPixelImpl[][] img) {
        this.img = img;
    }


    public String toString(){
        return String.format("Color %s",super.toString());
    }

}
