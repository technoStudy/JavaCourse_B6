package Day43.ExceptionsRecap.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class FindException {

    public static void main(String[] args) {
    // 1) where does exception occur
    // 2) catch and handle specific exception
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(0,1);
    arrayList.add(1,2);
    arrayList.add(2,3);
    arrayList.add(3,null);

    try {
        arrayList.get(4);
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Index you provide is out of bound!");
    }

    try {
        Collections.max(arrayList);
    } catch (NullPointerException ex) {
        System.out.println("You cannot compare null with Integers!");
    }

    arrayList.add(1,2);
    arrayList.add(2,3);
    arrayList.add(0,null);
    System.out.println(arrayList);

    }

}
