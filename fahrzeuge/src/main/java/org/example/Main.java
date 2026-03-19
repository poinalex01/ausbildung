import org.example.*;

void main() {
    String[][] routes = {{"Linz", "Graz", "220"}, {"Linz", "Vienna", "180"}, {"Vienna", "Graz", "200"}, {"Graz", "Linz", "220"}, {"Vienna", "Linz", "180"}, {"Graz", "Vienna", "200"}};

    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Car("Alex", 100, 150, 5));
    vehicles.add(new Truck("CompanyXY", 80, 300, 8, true));
    vehicles.add(new Bicycle("Max", 20, 2));
    vehicles.add(new CargoBike("Shoperino", 18, 50));


    for (Vehicle v : vehicles) {
        System.out.println("-".repeat(64));
        System.out.println(v.getClass().getSimpleName());
        System.out.println("Owner: " + v.getOwner());

        v.honk();

        for (String[] r : routes) {
            v.drive(r[0], r[1], Double.parseDouble(r[2]));
        }
    }


    System.out.println("-".repeat(64));
    System.out.println("-".repeat(64));
    System.out.println("-".repeat(64));
    System.out.println("-".repeat(64));
    System.out.println("-".repeat(64));


    Car car = new Car("carOwner", 100, 180, 5);
    System.out.println(car.getOwner());
    car.fullThrottle();
    System.out.println("car.getAvgSpeed() = " + car.getAvgSpeed());
    car.honk();
    car.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));

    System.out.println("-".repeat(64));

    Truck truckWithoutTrailer = new Truck("truckOwner (withTrailer)", 80, 350, 3, true);
    System.out.println(truckWithoutTrailer.getOwner());
    // truckWithoutTrailer.fullThrottle();
    System.out.println("truckWithoutTrailer.getAvgSpeed() = " + truckWithoutTrailer.getAvgSpeed());
    truckWithoutTrailer.honk();
    truckWithoutTrailer.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));

    System.out.println("-".repeat(64));

    Truck truckWithTrailer = new Truck("truckOwner (withoutTrailer)", 90, 225, 5, false);
    System.out.println(truckWithTrailer.getOwner());
    // truckWithTrailer.fullThrottle();
    System.out.println("truckWithTrailer.getAvgSpeed() = " + truckWithTrailer.getAvgSpeed());
    truckWithTrailer.honk();
    truckWithTrailer.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));

    System.out.println("-".repeat(64));

    Bicycle bicycleTooManySeats = new Bicycle("bicycleOwner (tooManySeats)", 20, 3);
    System.out.println(bicycleTooManySeats.getOwner());
    // bicycleTooManySeats.fullThrottle();
    bicycleTooManySeats.push();
    bicycleTooManySeats.pedal();
    System.out.println("bicycleTooManySeats.getAvgSpeed() = " + bicycleTooManySeats.getAvgSpeed());
    bicycleTooManySeats.honk();
    bicycleTooManySeats.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));

    System.out.println("-".repeat(64));

    Bicycle bicycle = new Bicycle("bicycleOwner", 20, 1);
    System.out.println(bicycle.getOwner());
    // bicycle.fullThrottle();
    bicycle.push();
    bicycle.pedal();
    System.out.println("bicycle.getAvgSpeed() = " + bicycle.getAvgSpeed());
    bicycle.honk();
    bicycle.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));

    System.out.println("-".repeat(64));

    CargoBike cargoBike = new CargoBike("cargoBikeOwner", 15, 1);
    System.out.println(cargoBike.getOwner());
    // bicycle.fullThrottle();
    cargoBike.push();
    cargoBike.pedal();
    System.out.println("cargoBike.getLoad() = " + cargoBike.getLoad());
    cargoBike.load(10);
    System.out.println("cargoBike.getLoad() = " + cargoBike.getLoad());
    System.out.println("cargoBike.getAvgSpeed() = " + cargoBike.getAvgSpeed());
    cargoBike.honk();
    cargoBike.drive(routes[0][0], routes[0][1], Double.parseDouble(routes[0][2]));
}