public class Player {
    private String name;
    private int age;
    private double height;
    private double weight;
    private double pointsScored;
    private int rebounds;
    private int assists;
    // Add more attributes as needed



    // Constructor with all attributes
    public Player(String name, int age, double height, double weight, double pointsScored, int rebounds, int assists) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.pointsScored = pointsScored;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter and setter for pointsScored
    public double getPointsScored() {
        return pointsScored;
    }
    // Setter for pointsScored  
    public void setPointsScored(double pointsScored) {
        this.pointsScored = pointsScored;
    }

    // Additional method to calculate BMI (Body Mass Index)
    public double calculateBMI() {
        // BMI formula: BMI = weight (kg) / (height (m) * height (m))
        double heightInMeters = height / 100.0; // Convert height to meters
        return weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height + " cm, Weight: " + weight + " kg: " + ", pointsScored: " + pointsScored;
    }

    public double getRebounds() {
        return 0;
    }

    public double getAssists() {
        return 0;
    }

    public Object getId() {
        return null;
    }

    public void setPhotoPath(String photoPath) {
    }

    public String getPhotoPath() {
        return null;
    }
}
