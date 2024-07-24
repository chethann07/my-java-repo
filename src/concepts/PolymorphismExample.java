package concepts;

import java.util.Scanner;

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void takeOff() {
        System.out.println("CargoPlane is taking off");
    }

    @Override
    void fly() {
        System.out.println("CargoPlane is flying");
    }

    @Override
    void land() {
        System.out.println("CargoPlane is landing");
    }
}

class PassengerPlane extends Plane {
    @Override
    void takeOff() {
        System.out.println("PassengerPlane is taking off");
    }

    @Override
    void fly() {
        System.out.println("PassengerPlane is flying");
    }

    @Override
    void land() {
        System.out.println("PassengerPlane is landing");
    }
}

class FighterPlane extends Plane {
    @Override
    void takeOff() {
        System.out.println("FighterPlane is taking off");
    }

    @Override
    void fly() {
        System.out.println("FighterPlane is flying");
    }

    @Override
    void land() {
        System.out.println("FighterPlane is landing");
    }
}

class Factory {
    public static Plane getPlane(String choice) {
        if (choice.equalsIgnoreCase("cargoplane")) {
            return new CargoPlane();
        } else if (choice.equalsIgnoreCase("passengerplane")) {
            return new PassengerPlane();
        } else if (choice.equalsIgnoreCase("fighterplane")) {
            return new FighterPlane();
        } else {
            return null;
        }
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the choice :\n Cargoplane \n Passengerplane \n FighterPlane");
        String choice = scan.next();
        Plane p = Factory.getPlane(choice);

        if (p == null) {
            System.out.println("Invalid choice");
        } else {
            p.takeOff();
            p.fly();
            p.land();
        }

        scan.close();

    }
}
