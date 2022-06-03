package Day25;

import java.util.*;

public class _03_CollectionsClass {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        Set<Integer> numbersSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbersList.add(randomNumber);
            numbersSet.add(randomNumber);
        }

        System.out.println("ArrayList when it's created: " + numbersList);
        System.out.println("HashSet when it's created: " + numbersSet);

        Integer[] numbersArray = {99, 55, 22, 44};

        // addAll() -- to add multiple elements into List/Set
        Collections.addAll(numbersList, numbersArray);
        System.out.println("List after using addAll method: " + numbersList);

        // sort() -- sort the list in ascending order
        Collections.sort(numbersList);
        System.out.println("ArrayList after using sort method: " + numbersList);

        // reverseOrder() -- sorts the elements in descending order (reverseOrder)
        Collections.sort(numbersList, Collections.reverseOrder());
        System.out.println("ArrayList after using reverseOrder method: " + numbersList);

        // max() -- to find the biggest number in Collection
        Integer maxValue = Collections.max(numbersList);
        System.out.println("Max value for ArrayList: " + maxValue);

        // min() -- to find the smallest number in Collection
        Integer minValue = Collections.min(numbersList);
        System.out.println("Min value for ArrayList: " + minValue);

        // max() and min() methods can be used for Sets too!
        Integer maxValueForSet = Collections.max(numbersSet);
        System.out.println("Max value for Set: " + maxValueForSet);

        Integer minValueForSet = Collections.min(numbersSet);
        System.out.println("Min value for Set: " + minValueForSet);

    }

}
