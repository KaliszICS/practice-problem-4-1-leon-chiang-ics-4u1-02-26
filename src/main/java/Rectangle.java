class Rectangle {
    private double length;
    private double width;

    public Rectangle(double side1, double side2) {
        this.length=side1;
        this.width=side2;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double area() {
        return this.length*this.width;
    }

    public double perimeter() {
        if (this.length<=0||this.width<=0) {
            return 0;
        }
        return this.length*2 + this.width*2;
    }
}