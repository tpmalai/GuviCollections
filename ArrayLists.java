package GuviJavaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Test");
        arr.add("Apple");
        arr.add("Cat");
     System.out.println(arr);
     arr.removeAll(arr);
     System.out.println(arr);
    }
}
