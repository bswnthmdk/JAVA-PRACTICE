abstract class Car {
    abstract String engine();

    abstract String type();

    abstract int seatNo();

    abstract String length();
}

abstract class Nexon extends Car {
    String engine() {
        return "1.0 Ltr";
    }

    String type() {
        return "Compact SUV";
    }
}

class completeNexon extends Nexon {
    int seatNo() {
        return 5;
    }

    String length() {
        return "3995 mm";
    }
}

public class OOP_027 {
    public static void main(String arg[]) {
        completeNexon myCompleteNexon = new completeNexon();
        System.out.println("Engine of the car: " + myCompleteNexon.engine());
        System.out.println("Type of the car: " + myCompleteNexon.type());
        System.out.println("Seat No of the car: " + myCompleteNexon.seatNo());
        System.out.println("Length of the car: " + myCompleteNexon.length());
    }
}