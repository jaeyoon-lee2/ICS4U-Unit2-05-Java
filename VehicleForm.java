/*
* This program uses the Vehicle class with constructor.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-25
*/
// package ca.mths.unit2.unit05.java.vehicleForm;

import java.util.Scanner;

public final class VehicleForm {
    private VehicleForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method get constructor input and commands.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        try {
            System.out.print("Enter the license plate number: ");
            String licensePlateNumber = myObj.nextLine();
            System.out.print("Enter the colour of the car: ");
            String colour = myObj.nextLine();
            System.out.print("Enter the number of doors: ");
            int numberOfDoors = Integer.parseInt(myObj.nextLine());
            System.out.print("Enter the max speed(km/h): ");
            int maxSpeed = Integer.parseInt(myObj.nextLine());

            Vehicle myVehicle = new Vehicle(licensePlateNumber, colour,
                                            numberOfDoors, maxSpeed);
            System.out.print("\n");

            while (true) {
                System.out.print("Enter the command: ");
                String inputString = myObj.nextLine().toUpperCase();
                if (inputString.equals("END")) {
                    break;
                } else if (inputString.equals("ACCELERATE")) {
                    System.out.print("Enter the value to be accelerated"
                                        + "(km/h): ");
                    myVehicle.accelerate(Integer.parseInt(myObj.nextLine()));
                } else if (inputString.equals("BRAKE")) {
                    System.out.print("Enter the value to be decelerated"
                                        + "(km/h): ");
                    myVehicle.brake(Integer.parseInt(myObj.nextLine()));
                } else if (inputString.equals("LICENSE")) {
                    System.out.print("Enter the new license plate number: ");
                    myVehicle.setLicensePlateNumber(myObj.nextLine());
                } else if (inputString.equals("COLOUR")) {
                    System.out.print("Enter the new colour of the car: ");
                    myVehicle.setColour(myObj.nextLine());
                } else {
                    continue;
                }
            }
            System.out.println("\nMy Vehicle:");
            myVehicle.printVehicleInfo();
        } catch (Exception ex) {
            System.err.print("Invalid input.");
        }
        System.out.println("\nDone.");
    }
}
