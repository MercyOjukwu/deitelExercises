package dataStructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyArrayList extends ArrayList{
    HashMap<String,String> map = new HashMap<>();
    private int index;
    String[] array;
    private int size = 10;

    public void addElementToList(String element) {
        array = new String[size];
        array[index] = element;
        index++;
    }

    public String getElementByIndex(int index) {
        this.index = index;
        return array[index] ;
    }

    public void addMultipleElementsToList(String... elements) {
        array = elements;
//        System.out.println(Arrays.toString(array));
        for(index = 0; index < array.length; index++){
          if (map.containsKey(array[index])) return;
          map.put(array[index], elements[index]);
        }

    }

    public int getCount() {
        return map.size();
    }


    public void removeElement(int i) {
        for(index = 0; index < array.length; index++){
            if(index == i) {
                array[index] = array[index + 1];
            }
            for(int k = index; k < array.length - 1; k++){
                array[k] = array[k + 1];
            }
            size--;
        }
    }

}
