package lab07_2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AnimalsController {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Horse horse=new Horse();
        Tiger tiger=new Tiger();
        List<Animals> animalsList= Arrays.asList(dog,horse,tiger);
        Animals max= getMaxSpeed(animalsList);
        System.out.println("Winer is "+max.getClass().getSimpleName()+" with speed:"+ max.getSpeed());
    }

    public static Animals getMaxSpeed(List <Animals> animalsList){
        Animals max=animalsList.get(0);
        for(Animals animal:animalsList){
            if(animal.getSpeed()>max.getSpeed())
                max=animal;
        }
        return max;
    }
}
