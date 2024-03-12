class Circle extends Shape {
    // Private attributes
    private Float radius;

    // Constructor
    public Circle(Float radius) {
        this.radius = radius;
    }

    // Getter and setter for radius
    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    // Method to calculate perimeter for Circle
    public Double calculatePerimeter() {
        return 2.0d * Math.PI * radius;
    }
}