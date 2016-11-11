package fh.java.geometry;

/**
 * Created by Florian on 10.11.2016.
 */


import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.threedimensional.Cuboid;
import fh.java.geometry.model.threedimensional.Pyramid;
import fh.java.geometry.model.threedimensional.Sphere;
import fh.java.geometry.model.threedimensional.ThreeDimensionalShape;
import fh.java.geometry.model.twodimensional.Rhombus;
import fh.java.geometry.model.twodimensional.Trapezium;
import fh.java.geometry.model.twodimensional.Triangle;
import fh.java.geometry.model.twodimensional.TwoDimensionalShape;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();



    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);

        List<TwoDimensionalShape> twoDimensionalShapeList = new ArrayList<>();
        List<ThreeDimensionalShape> threeDimensionalShapeList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof TwoDimensionalShape) {
                twoDimensionalShapeList.add((TwoDimensionalShape) shape);
            } else if (shape instanceof ThreeDimensionalShape) {
                threeDimensionalShapeList.add((ThreeDimensionalShape) shape);
            }
        }

        double sumArea = 0;
        double sumPerimeter = 0;
        System.out.println("----------twoDimensionalShapes---------------");
        for (TwoDimensionalShape twoDimensionalShape : twoDimensionalShapeList) {
            System.out.println(twoDimensionalShape);
            sumArea += twoDimensionalShape.calcArea();
            sumPerimeter +=twoDimensionalShape.calcPerimeter();
        }
        System.out.println("Total Area: "+ sumArea + ", Total Perimeter: "+ sumPerimeter);


        double sumVolume = 0;
        double sumSurfaceArea = 0;
        System.out.println("----------threeDimensionalShapes---------------");
        for (ThreeDimensionalShape threeDimensionalShape : threeDimensionalShapeList) {
            System.out.println(threeDimensionalShape);
            sumVolume += threeDimensionalShape.calculateVolume();
            sumSurfaceArea +=threeDimensionalShape.calculateSurfaceArea();
        }
        System.out.println("Total Volume: "+ sumVolume + ", Total Surface Area: "+ sumSurfaceArea);

    }


    public void fillList(List<GeometricShape> shapeList) {
    shapeList.add(new Rhombus(1,2,7.1,10.0,10.0));
    shapeList.add(new Rhombus(3,4,5.0,6.0,8.0));
    shapeList.add(new Trapezium(0,0,5.0,3.0,2.0,3.0,10.0));
    shapeList.add(new Trapezium(3,4,7.0,5.0,5.0,5.0,15.0));
    shapeList.add(new Triangle(2,2,3.0,4.0,5.0,2.4));
    shapeList.add(new Triangle(2,2,9.0,7.3,10.0,6.3));
    shapeList.add(new Cuboid(0,0,5.0,3.0,6.0));
    shapeList.add(new Cuboid(3,2,8.0,9.0,10.0));
    shapeList.add(new Pyramid(0,0,2.0,3.0,6.0,4.0,4.0));
    shapeList.add(new Pyramid(0,0,3.0,4.0,7.0,5.0,5.0));
    shapeList.add(new Sphere(0,0,10));
    shapeList.add(new Sphere(4,2,5));

    }

    public void printList(List<GeometricShape> shapeList)  {

        shapeList.stream().forEach(System.out::println);

    }

}
