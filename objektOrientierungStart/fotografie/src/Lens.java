public class Lens {
    static int counter = 0;

    private int minFocalLength;
    private int maxFocalLength;

    public Lens(int minFocalLength, int maxFocalLength) {
        if (minFocalLength > maxFocalLength) {
            int temp = minFocalLength;
            minFocalLength = maxFocalLength;
            maxFocalLength = temp;
            System.out.println("Switching min and max focal length!");
        }
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        counter++;
    }

    @Override
    public String toString() {
        return "Lens{" + "minFocalLength=" + minFocalLength + ", maxFocalLength=" + maxFocalLength + '}';
    }

    public static int getCounter() {
        return counter;
    }

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }
}
