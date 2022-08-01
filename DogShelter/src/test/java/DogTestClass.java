import exceptions.BreedNotFoundException;
import model.Breed;
import model.Dog;
import service.AdoptionCenterService;

import java.util.ArrayList;
import java.util.List;

public class DogTestClass {
    private static Dog doggo;
    private static List <Dog> doggos = new ArrayList();
    private  static AdoptionCenterService adoptionCenterService;

    @BeforeClass
    public static  void maketestDogs(){
        doggo = new Dog("Pearl", 2, true,"poodle");

        doggos.add(new Dog("Patrick", 42, false,"mastiff"));
        doggos.add(new Dog("Bart", 4, true,"cat"));
        doggos.add(new Dog("Manuel", 1, true,"pug"));
        adoptionCenterService = new AdoptionCenterService();

    }

    @Test
     public void testGetName(){
        Assert.assertEquals("Pear", doggo.getName());
    }

    @Test
    public void dogBreedException(){

        Assert.assertThrows(BreedNotFoundException.class, ()-> adoptionCenterService.getDogsOfBreed(doggos, "Dalmatian"));

        
    }

    @Test
    public void vaccinatedDogs(){

        List<Dog> vaccinatedDoggos = adoptionCenterService.getAllVaccinatedDogs(doggos);
        Assert.assertNotEquals(3, vaccinatedDoggos.size());

    }

    @Test
    public void getAge(){

        Assert.assertEquals(11, adoptionCenterService.getAgeInHumanYears(doggo));

    }




}
