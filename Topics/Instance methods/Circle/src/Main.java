class Circle {

    double radius;

    public double getLength() {
        double length = 2 * Math.PI * this.radius;
        return length;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius,2);
        return area;
    }

}