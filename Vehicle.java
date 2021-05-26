/*
* This class use contructor.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-21
*/
// package ca.mths.unit2.unit05.java.vehicle;

public final class Vehicle {
    /** Field : License plate number. */
    private String licensePlateNumber;
    /** Field : Colour. */
    private String colour;
    /** Field : Number of doors. */
    private int numberOfDoors;
    /** Field : Speed. */
    private int speed = 0;
    /** Field : Max speed. */
    private int maxSpeed;

    /**
    * This method constructs the vehilce class.
    * @param initLicensePlateNumber
    * @param initColour
    * @param initNumberOfDoors
    * @param initMaxSpeed
    */
    public Vehicle(final String initLicensePlateNumber, final String initColour,
                   final int initNumberOfDoors, final int initMaxSpeed) {
        this.licensePlateNumber = initLicensePlateNumber;
        this.colour = initColour;
        this.numberOfDoors = initNumberOfDoors;
        this.maxSpeed = initMaxSpeed;
    }

    // getters
    /**
    * This method returns the license plate number.
    * @return licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
    }

    /**
    * This method returns the colour of the car.
    * @return colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * This method returns the number of doors.
    * @return numberOfDoors
    */
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    /**
    * This method returns the max speed.
    * @return maxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * This method returns current speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    // setters
    /**
    * This method gets new license plate number and sets it.
    * @param newLicensePlateNumber
    */
    public void setLicensePlateNumber(final String newLicensePlateNumber) {
        this.licensePlateNumber = newLicensePlateNumber;
    }

    /**
    * This method gets new colour and sets it.
    * @param newColour
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
    * This method prints to console all the properties.
    */
    public void printVehicleInfo() {
        System.out.println("License plate number: " + getLicensePlateNumber());
        System.out.println("Colour: " + getColour());
        System.out.println("Number of doors : " + getNumberOfDoors());
        System.out.println("Max speed: " + getMaxSpeed() + "km/h");
        System.out.println("Current speed: " + getSpeed() + "km/h");
    }

    /**
    * This method accelerates the speed.
    * @param increment
    */
    public void accelerate(final int increment) {
        if (speed + increment <= maxSpeed) {
            this.speed += increment;
        } else {
            System.out.println("The vehicle is at max speed!");
            this.speed = maxSpeed;
        }
    }

    /**
    * This method decelerates the speed.
    * @param decrement
    */
    public void brake(final int decrement) {
        if (speed - decrement >= 0) {
            this.speed -= decrement;
        } else {
            System.out.println("The vehicle has stopped!");
            this.speed = 0;
        }
    }
}
