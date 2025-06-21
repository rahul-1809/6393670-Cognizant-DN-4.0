import java.util.*;

public class ProxyImage implements Image {
    private RealImage realImage;
    private final String filename;

    private static final Map<String, RealImage> imageCache = new HashMap<>();

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = imageCache.get(filename);
            if (realImage == null) {
                realImage = new RealImage(filename);
                imageCache.put(filename, realImage);
            }
        }
        realImage.display();
    }
}