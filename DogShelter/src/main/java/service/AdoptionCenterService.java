package service;

import exceptions.BreedNotFoundException;
import model.Breed;
import model.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdoptionCenterService {

public int getAgeInHumanYears(Dog dog){
int age = dog.getAge();

//if dog is > 2 years old do condition
    // else *7

    if(dog.getAge()>1) age = age*2+7;
    else age = age*7;

    return age;
}

public List<Dog> getAllVaccinatedDogs(List<Dog> dogs){
    List<Dog> doggos = new ArrayList();
    for (Dog dog : dogs)
        if (dog.isVaccinated())
            doggos.add(dog);
    return doggos;
}

    public List<Dog> getDogsOfBreed (List<Dog> dogsGiven, String breedGiven) throws BreedNotFoundException {
        List<Dog> doggos = new ArrayList();
        List<String> dogBreeds = new ArrayList();
        for (Breed breed: Arrays.asList(Breed.values())) dogBreeds.add(breed.name());

        for (Dog dog : dogsGiven) {
            for (Breed breed : Breed.values())
                if (dog.getBreed().toUpperCase().equals(breed.name())&&breedGiven.toUpperCase().equals(breed.name()) )
                    doggos.add(dog);

                if(!dogBreeds.contains(breedGiven.toUpperCase()))
                 throw new BreedNotFoundException("The breed '"+breedGiven.toUpperCase()+"' does not exist");
        }
        return doggos;
    }

}
