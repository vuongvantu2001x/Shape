public class Shape implements GetArea{
    private String coler = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String coler, boolean filled) {
        this.coler = coler;
        this.filled = filled;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled) {
            return "\nA Shape with color of " + coler +
                    " and filled";
        } else {
            return "\nA Shape with color of " + coler +
                    " and not filled";
        }
    }


    @Override
    public double getArea() {
        return getArea();
    }
}



