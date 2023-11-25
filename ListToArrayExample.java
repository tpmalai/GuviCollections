package GuviJavaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");


        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);


        System.out.println("Array elements:");

        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

