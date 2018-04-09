import java.util.ArrayList;
import java.util.List;

public class DogShelter {

    public static void main(String[] args) {

        List<Dog> kennel = new ArrayList<>();

        Dog morzsi = new Dog("Morzsi", 15);
        Dog fifike = new Dog("Fifike", 3);
        Dog ramboka = new Dog("Ramboka", 33);
        Dog bubu = new Dog("Bubu", 18);
        Dog cezar = new Dog("Cezar", 29);
        Dog rex = new Dog("Rex", 10);
        Dog patkany = new Dog("Patkany", 2);

        kennel.add(morzsi);
        kennel.add(fifike);
        kennel.add(ramboka);
        kennel.add(bubu);
        kennel.add(cezar);
        kennel.add(rex);
        kennel.add(patkany);

        for (int i = 0; i < kennel.size(); i++) {
            System.out.println(kennel.get(i).getName() + " " + kennel.get(i).getSize() + " " + kennel.get(i).getWeight());
        }
        for (int i = 0; i < kennel.size(); i++) {
            kennel.get(i).extraFoodForDog(kennel.get(i), 100);
            System.out.println(kennel.get(i).getName() + " " + kennel.get(i).getSize() + " " + kennel.get(i).getWeight());
        }
    }
}
