public class Dog extends Animal{


    private String breed;
    public Dog(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void produceS(){
        System.out.println("bhau bhau !! ");
    }

}
