package model;

public class Dog {

    private String name;
    private int age;
    private boolean vaccinated;
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, boolean vaccinated, String breed) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
