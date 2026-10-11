package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Cf3{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        // 1. add() - Add elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println("add(): " + arr);

        // 2. add(index, element) - Add at a specific index
        arr.add(1, 15);
        System.out.println("add(index): " + arr);

        // 3. get() - Get element using index
        System.out.println("get(): " + arr.get(2));

        // 4. set() - Replace an element
        arr.set(2, 25);
        System.out.println("set(): " + arr);

        // 5. remove(index) - Remove by index
        arr.remove(1);
        System.out.println("remove(index): " + arr);

        // 6. remove(value) - Remove by value
        arr.remove(Integer.valueOf(40));
        System.out.println("remove(value): " + arr);

        // 7. size() - Count elements
        System.out.println("size(): " + arr.size());

        // 8. contains() - Check if an element exists
        System.out.println("contains(): " + arr.contains(30));

        // 9. indexOf() - First occurrence index
        arr.add(30);
        System.out.println("indexOf(): " + arr.indexOf(30));

        // 10. lastIndexOf() - Last occurrence index
        System.out.println("lastIndexOf(): " + arr.lastIndexOf(30));

        // 11. isEmpty() - Check if list is empty
        System.out.println("isEmpty(): " + arr.isEmpty());

        // 12. addAll() - Add another collection
        ArrayList<Integer> other = new ArrayList<>();
        other.add(50);
        other.add(60);
        arr.addAll(other);
        System.out.println("addAll(): " + arr);

        // 13. containsAll() - Check all elements
        System.out.println("containsAll(): " + arr.containsAll(other));

        // 14. removeAll() - Remove matching elements
        arr.removeAll(other);
        System.out.println("removeAll(): " + arr);

        // 15. retainAll() - Keep only matching elements
        arr.retainAll(Arrays.asList(10, 25, 30));
        System.out.println("retainAll(): " + arr);

        // 16. toArray() - Convert list into an array
        Integer[] array = arr.toArray(new Integer[0]);
        System.out.println("toArray(): " + Arrays.toString(array));

        // 17. Collections.sort() - Sort ascending
        Collections.sort(arr);
        System.out.println("sort(): " + arr);

        // 18. Collections.reverse() - Reverse the list
        Collections.reverse(arr);
        System.out.println("reverse(): " + arr);

        // 19. Collections.shuffle() - Shuffle elements
        Collections.shuffle(arr);
        System.out.println("shuffle(): " + arr);

        // 20. clone() - Create a shallow copy
        ArrayList<Integer> copy = (ArrayList<Integer>) arr.clone();
        System.out.println("clone(): " + copy);

        // 21. Iterator - Traverse elements
        Iterator<Integer> it = arr.iterator();
        System.out.print("Iterator: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 22. forEach() - Traverse using lambda
        System.out.print("forEach(): ");
        arr.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 23. clear() - Remove all elements
        arr.clear();
        System.out.println("clear(): " + arr);

        // 24. ensureCapacity() - Increase minimum internal capacity
        arr.ensureCapacity(20);

        // 25. trimToSize() - Reduce capacity to current size
        arr.trimToSize();
    }
}