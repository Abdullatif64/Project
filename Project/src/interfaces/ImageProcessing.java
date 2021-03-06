
package interfaces;

import java.util.Map;


public interface ImageProcessing {
   public abstract  Image thresholding (Image image, int thresholdValue); 
   public abstract Image toDouble (Image image);
   public abstract Map<Integer, Integer> Histogram (Image image);
   public abstract int MatchPattern(Image subimage, Image image);
}
