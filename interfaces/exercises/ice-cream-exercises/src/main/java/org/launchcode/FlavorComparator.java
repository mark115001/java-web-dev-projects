import java.util.Comparator;

public class FlavorComparator implements Comparator <org.launchcode.Flavor.Flavor> {


    @Override
    public int compare(org.launchcode.Flavor.Flavor flavor1, org.launchcode.Flavor.Flavor flavor2) {
        return flavor1.getName().compareTo(flavor2.getName());
    }
}
