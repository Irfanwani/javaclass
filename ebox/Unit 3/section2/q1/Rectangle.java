class Rectangle extends Shape {
    // Private attributes
    private Float length;
    private Float breadth;

    // Constructor
    public Rectangle(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getters and setters for length and breadth
    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getBreadth() {
        return breadth;
    }

    public void setBreadth(Float breadth) {
        this.breadth = breadth;
    }

    // Method to calculate perimeter for Rectangle
    public Double calculatePerimeter() {
        return 2.0d * (length + breadth);
    }
}