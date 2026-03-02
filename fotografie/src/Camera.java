public class Camera {
    static int counter = 0;

    private String brand;
    private int megaPixels;
    private int displaySize;
    private boolean isColored;
    private Lens lens;

    public Camera(String brand, int megaPixels, int displaySize, boolean isColored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.isColored = isColored;
        this.lens = lens;

        counter++;
    }

    @Override
    public String toString() {
        return "Camera{" + "brand='" + brand + '\'' + ", megaPixels=" + megaPixels + ", displaySize=" + displaySize + ", isColored=" + isColored + ", lens=" + lens + '}';
    }

    public static int getCounter() {
        return counter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }
}
