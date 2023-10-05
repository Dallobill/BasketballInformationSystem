

public class MyPlayer {
    //Properties
    private String name;
    private int age;
    private double height;
    private double weight;
    private String dominantHand;
    private String position;


    //Contructor to intialize the player object  
    public MyPlayer(String name, int height, String position, String dominantHand, String strength, String weakness){
        this.name = name;
        this.height = height;
        this.dominantHand = dominantHand;
        this.position = position;


    }

    //getter for name property
    public String getName(){
        return name;
    }

    //setter for name properties
    public void setName(String name){
        this.name = name;
    }

    // getter for age property
    public int getAge(){
        return age;
    }

    // setter for age property
    public void setAge(int age){
        this.age = age;
    }


    // getter for height property
    public int getHeight(){
        return (int) height;
    } 

    //setter for height property
    public void setHeight(int height){
        this.height = height;
    }

    // getter for weight property
    public double getWeight(){
        return weight;
    }

    // setter for weight property
    public void setWeight(double weight){
        this.weight = weight;
    }

    //Getter for position property
    public String getPosition(){
        return position;
    } 

    // Setter for position property
    public void setPosition(String position){
        this.position = position;
    }

    // Getter for dominantHand property
    public String getDominantHand(){
        return dominantHand;
    }

    // Setter for dominantHand property
    public void setDominantHand(String dominantHand){
        this.dominantHand = dominantHand;
    }
    
}
