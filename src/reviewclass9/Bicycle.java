package reviewclass9;

import java.util.Objects;

public class Bicycle {
    String make;
    int gears;
    int maxSpeed;

    //TO GENERATE A CONSTRUCTOR FOR BICYCLE:
    //Right click, click Generate, click constructor, shift select all attributes, click OK
    public Bicycle(String make, int gears, int maxSpeed) {
        this.make = make;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }


    void ride() {
        System.out.println("Its time to ride bicycles");
    }

    void applyBrakes() {
        System.out.println("Applying brakes");
    }

    //TO OVERRIDE "toString()", (which is a method that prints package name, class, and @address of an object)
    // and add method that return's an object's attributes/fields/parameters:
    //type toString and select the second option (generate via wizard) to generate this method automatically!
    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return gears == bicycle.gears && maxSpeed == bicycle.maxSpeed && Objects.equals(make, bicycle.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, gears, maxSpeed);
    }
}

    class MountainBikes extends Bicycle{
        boolean suspension = true;
        int seatHeight;

        //To create this constructor for above class, press alt enter "create constructor matching super":
        public MountainBikes(String make, int gears, int maxSpeed, int seatHeight) {
            super(make, gears, maxSpeed);
            this.seatHeight=seatHeight;


        }

        void setSeatHeight(int seatHeight) {
            this.seatHeight = seatHeight;
        }
    }

    class Test {
        public static void main(String[] args) {
            //The 3 parameters below are a call to the contructor on line 12
            Bicycle bike = new Bicycle("TREK", 4, 30);
            Bicycle bike2 = new Bicycle("TREK", 4, 30);
            System.out.println(bike==bike2);            //never use "==" to compare non-primitive data types
            System.out.println(bike.equals(bike2));
            String name = new String("tara");
            String name2 = new String("tara");
            System.out.println(name.equals(name2));     //".equals" with string class works as its part of "object"
           // System.out.println(bike);                 // class that is inherited by all classes in Java (built in)
        }

    }


