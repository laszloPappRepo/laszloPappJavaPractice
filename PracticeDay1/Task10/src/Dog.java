public class Dog {

    private String name;
    private String size;
    private double weight;

    public Dog() {
    }

    public Dog(String name, double weight) {
        this.name = name;
        if (weight < 7){
            size = "small";
        }else if ((weight >= 7) && (weight < 21)){
            size = "medium";
        }else {
            size = "big";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void extraFoodForDog(Dog dog, int percentage){
        double weightPercentage = (dog.weight * percentage) / 100;
        dog.setWeight(weight + weightPercentage);
    }
}
