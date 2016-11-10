package fh.java.geometry.model.twodimensional;

/**
 * Created by Florian on 10.11.2016.
 */
public class Triangle extends TwoDimensionalShape {

    protected double sideB;
    protected double sideC;
    protected double heightC;

    public Triangle() {
    }


    public Triangle(int x, int y, double sideA, double sideB, double sideC, double heightC) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightC = heightC;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeightC() {
        return heightC;
    }

    public void setHeightC(double heightC) {
        this.heightC = heightC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        if (Double.compare(triangle.sideC, sideC) != 0) return false;
        return Double.compare(triangle.heightC, heightC) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", heightC=").append(heightC);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }


    @Override
    public double calcArea() {
        return 0.5 * sideC * heightC;
    }

    @Override
    public double calcPerimeter() {
        return sideA+sideB+sideC;
    }
}
