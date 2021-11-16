import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {

    private String sortOrder = "ASC";

    public AgeComparator(String sortOrder){
        this.sortOrder = sortOrder;
    }
    @Override
    public int compare(Animal o1, Animal o2) {
        if (sortOrder.equals("ASC")){
            return o1.getAge() - o2.getAge();
        } else if (sortOrder.equals("DESC")){
            return (o1.getAge() - o2.getAge()) - 1;
        }
        return 0;

    }
}
