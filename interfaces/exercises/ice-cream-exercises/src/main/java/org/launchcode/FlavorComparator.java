import org.launchcode.Flavor.Flavor;
import java.util.Comparator;

public class FlavorComparator  implements Comparator<org.launchcode.Flavor.Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
