import javax.naming.Name;
import java.util.Comparator;

public class NameComparator implements Comparator<Animal> {

    private String sortOrder = "ASC";

    public NameComparator(String sortOrder){
        this.sortOrder = sortOrder;
    }


    @Override
    public int compare(Animal o1, Animal o2) {
        if (sortOrder.equals("ASC")){
            return o1.getName().compareTo(o2.getName());
        } else if (sortOrder.equals("DESC")){
            return (o1.getName().compareTo(o2.getName())) * -1;
        }
        return 0;
    }
}
