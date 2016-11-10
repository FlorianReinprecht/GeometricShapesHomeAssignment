package fh.java.geometry.model.twodimensional;

/**
 * Created by Florian on 10.11.2016.
 */
import fh.java.geometry.model.GeometricShape;

public abstract class TwoDimensionalShape extends GeometricShape {

    protected double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TwoDimensionalShape that = (TwoDimensionalShape) o;

        return Double.compare(that.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }



}