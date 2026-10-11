package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class Cf1 {
    public static void main(String args[]) {
        // ArrayList reference: Can access ArrayList-specific methods and inherited methods.
        ArrayList<Integer> arr = new ArrayList<>();

// List reference: Can access List interface methods and inherited methods.
        List<Integer> list = new ArrayList<>();

// Collection reference: Can access common Collection interface methods.
        Collection<Integer> collection = new ArrayList<>();
    }
}

