package lab_08;

import java.security.SecureRandom;
import java.util.*;

import static lab_08.Animals.Builder;
public class AnimalController {
    public static void main(String[] args) {
        Builder animalBuilder=new Builder();
//        animalBuilder.setName("meo");
//        animalBuilder.setSpeed(new SecureRandom().nextInt(50));
//        animalBuilder.setFlyable(false);
//        Animals meo= animalBuilder.build();
        Animals a= animalBuilder.setName("A").setFlyable(false).setSpeed(new SecureRandom().nextInt(60)).build();
        Animals b= animalBuilder.setName("B").setFlyable(true).setSpeed(new SecureRandom().nextInt(90)).build();
        Animals c= animalBuilder.setName("C").setFlyable(false).setSpeed(new SecureRandom().nextInt(70)).build();
        Animals d= animalBuilder.setName("D").setFlyable(true).setSpeed(new SecureRandom().nextInt(75)).build();
        Animals e= animalBuilder.setName("E").setFlyable(false).setSpeed(new SecureRandom().nextInt(50)).build();

        List<Animals> animalsList=new ArrayList<>();
        animalsList.add(a);
        animalsList.add(b);
        animalsList.add(c);
        animalsList.add(d);
        animalsList.add(e);
        List<Animals> animalWithoutWingsList= new ArrayList<>();
        for(Animals animal:animalsList){
            if(!animal.isFlyable()==true){
                animalWithoutWingsList.add(animal);
            }
        }
        getMaxSpeed(animalWithoutWingsList);
    }
    public static  void getMaxSpeed(List <Animals> animalsList){
     Animals max=animalsList.get(0);
        for(Animals animal:animalsList){
            if(animal.getSpeed()>max.getSpeed())
                max=animal;
        }
        System.out.println("Winer is "+max.getName()+" with speed:"+ max.getSpeed());
    }
}
