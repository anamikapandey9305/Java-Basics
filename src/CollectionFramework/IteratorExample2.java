package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {
    public static void main(String[] args){
        ArrayList<Integer> list  = new ArrayList<>();

        list.add(45);
        list.add(65);
        list.add(95);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
