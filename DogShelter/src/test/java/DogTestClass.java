import exceptions.BreedNotFoundException;
import model.Breed;
import model.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.AdoptionCenterService;

import java.util.ArrayList;
import java.util.List;

public class DogTestClass {
    private static Dog doggo;
    private static List <Dog> doggos = new ArrayList();
    private  static AdoptionCenterService adoptionCenterService;

    @BeforeAll
    public static  void maketestDogs(){
        doggo = new Dog("Pearl", 2, true,"poodle");

        doggos.add(new Dog("Patrick", 42, false,"mastiff"));
        doggos.add(new Dog("Bart", 4, true,"cat"));
        doggos.add(new Dog("Manuel", 1, true,"pug"));
        adoptionCenterService = new AdoptionCenterService();

    }

    @Test
     public void testGetName(){
        Assertions.assertEquals("Pear", doggo.getName());
    }

    @Test
    public void dogBreedException(){

        Assertions.assertThrows(BreedNotFoundException.class, ()-> adoptionCenterService.getDogsOfBreed(doggos, "Dalmatian"));

        
    }

    @Test
    public void vaccinatedDogs(){

        List<Dog> vaccinatedDoggos = adoptionCenterService.getAllVaccinatedDogs(doggos);
        Assertions.assertNotEquals(3, vaccinatedDoggos.size());

    }

    @Test
    public void getAge(){

        Assertions.assertEquals(11, adoptionCenterService.getAgeInHumanYears(doggo));

    }




}
