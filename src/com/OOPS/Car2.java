package com.OOPS;

class Car2 {
    String carName;
    String carType;

    // assign values using constructor
    public Car2(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;
        void setEngine() {

            // Accessing the carType property of Car
            if(Car2.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car2.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

class Main3 {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car2 car1 = new Car2("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car2.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car2 car2 = new Car2("Crysler", "4WD");
        Car2.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
