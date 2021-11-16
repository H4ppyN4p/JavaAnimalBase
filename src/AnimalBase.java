import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalBase {

    private ArrayList<Animal> animals;

    public AnimalBase() {
        animals = new ArrayList<>();
    }

    public void start() {
        Animal anim1 = new Animal("Amiya", "magical", "Donkey", 22);
        Animal anim2 = new Animal("Bitta", "stunning", "Cow", 24);
        Animal anim3 = new Animal("Cimmer", "amazing", "Antilope", 23);

        animals.add(anim1);
        animals.add(anim3);
        animals.add(anim2);

        UserInterface ui = new UserInterface(this);
        ui.start();
    }

    public static void main(String[] args) {
        AnimalBase app = new AnimalBase();
        app.start();
    }

    public Iterable<Animal> getAllAnimals() {
        return animals;
    }

    public void sortBy(String sort, String direction) {
        NameComparator nameComparator = new NameComparator(direction);
        TypeComparator typeComparator = new TypeComparator(direction);
        AgeComparator ageComparator = new AgeComparator(direction);


        if (sort.equals("name")){
            Collections.sort(animals, nameComparator);

        } else if (sort.equals("type")){
            Collections.sort(animals, typeComparator);

        } else if (sort.equals("age")){
            Collections.sort(animals, ageComparator);

        }
    }

    public void createNewAnimal(String name, String description, String type, int age) {
        Animal animal = new Animal(name,description,type,age);
        animals.add(animal);
    }

    public void deleteAnimal(String name) throws NonExistingAnimalException {
        // find animal with this name
        Animal animal = findAnimalByName(name);
        if(animal == null) {
            throw new NonExistingAnimalException();
        } else {
            animals.remove(animal);
        }
    }

    private Animal findAnimalByName(String name) {
        for(Animal animal : animals) {
            if(animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }


    public void loadDatabase() {
        System.err.println("LOAD not yet implemented!");
    }

    public void saveDatabase() {
        System.err.println("SAVE not yet implemented!");
    }

}
