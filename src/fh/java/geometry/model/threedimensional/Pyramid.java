package fh.java.geometry.model.threedimensional;

/**
 * Created by Florian on 10.11.2016.
 */
public class Pyramid extends ThreeDimensionalShape {

    protected double sideA;
    protected double sideB;
    protected double height;
    protected double heightA;
    protected double heightB;

    public Pyramid() {

    }

    public Pyramid(int x,int y, double sideA, double sideB, double height, double heightA, double heightB) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.heightA = heightA;
        this.heightB = heightB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeightA() {
        return heightA;
    }

    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }

    public double getHeightB() {
        return heightB;
    }

    public void setHeightB(double heightB) {
        this.heightB = heightB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramid pyramid = (Pyramid) o;

        if (Double.compare(pyramid.sideA, sideA) != 0) return false;
        if (Double.compare(pyramid.sideB, sideB) != 0) return false;
        if (Double.compare(pyramid.height, height) != 0) return false;
        if (Double.compare(pyramid.heightA, heightA) != 0) return false;
        return Double.compare(pyramid.heightB, heightB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", height=").append(height);
        sb.append(", heightA=").append(heightA);
        sb.append(", heightB=").append(heightB);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", SurfaceArea=").append(calculateSurfaceArea());

        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateVolume() {
        return (1.0/3.0)*sideA*sideB*height;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideA*sideB + sideA*heightA + sideB*heightB;
    }
}
