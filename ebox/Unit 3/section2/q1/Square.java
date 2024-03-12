class Square extends Shape {
    // Private attribute
    private Float side;

    // Constructor
    public Square(Float side) {
        this.side = side;
    }

    // Getter and setter for side
    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    // Method to calculate perimeter for Square
    public Double calculatePerimeter() {
        return 4.0d * side;
    }
}