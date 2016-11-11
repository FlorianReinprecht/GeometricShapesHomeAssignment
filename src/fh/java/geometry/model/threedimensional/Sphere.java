package fh.java.geometry.model.threedimensional;

/**
 * Created by Florian on 10.11.2016.
 */
public class Sphere extends ThreeDimensionalShape {

    protected double radius;

    public Sphere() {
    }

    public Sphere(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sphere sphere = (Sphere) o;

        return Double.compare(sphere.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Spehre{");
        sb.append("radius=").append(radius);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", SurfaceArea=").append(calculateSurfaceArea());

        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateVolume() {
        return ((4.0/3.0)*Math.PI) * (radius*radius*radius);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * (radius*radius);
    }
}
