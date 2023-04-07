public class planet {
    
    //Input name & gravit
    private String planetName;
    private double planetGravity;

    //Constructor for inputs
    public planet(String planetName, double planetGravity) {
        this.planetName = planetName;
        this.planetGravity = planetGravity;
    }

    //Method for calculating range
     public double calculateRange(double angle, double initialSpeed) {
        double range = (Math.pow(initialSpeed, 2) * Math.sin(2 * Math.toRadians(angle))) / planetGravity;
        return range;
    }

    //The Get methods for getting Gravity & planetName from user
    public  String getName() {
        return planetName;
    }

   
    public double getGravity() {
        return planetGravity;
    }


}
