import java.util.Comparator;

public class TypeComparator implements Comparator<Animal> {

    private String sortOrder = "ASC";

    public TypeComparator(String sortOrder){
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        if (sortOrder.equals("ASC")){
            return o1.getType().compareTo(o2.getType());
        } else if (sortOrder.equals("DESC")){
            return (o1.getType().compareTo(o2.getType())) * -1;
        }
        return 0;
    }
}
