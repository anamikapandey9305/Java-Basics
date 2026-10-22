package CollectionFramework;
import java.util.ArrayList;

public class SearchingInAnArrayList3 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int target = 30;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                System.out.println("Found at index: " + i);
                break;
            }
        }
    }
}
