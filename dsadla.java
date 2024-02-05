class Vehicle {
  protected String brand = "Fod8r";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuto");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustnnnnag";    // Car attribute
  public static void main(Strig[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
