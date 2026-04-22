class Circle {
    private double radius;

    public Circle (double r) {
        this.radius=r;
    }

    public double getRadius() {
        return this.radius;
    }
    public double area() {
        return this.radius*this.radius*3.14;
    }

    public double circumference() {
        return this.radius*2*3.14;
    }
}
