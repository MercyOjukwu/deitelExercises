package dataStructures;

public class MyHashMap{
    MyArrayList map = new MyArrayList();

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void addMultipleElementsToList(String... elements){
        map.addMultipleElementsToList(elements);
    }

    public int getCount(){
        return map.getCount();
    }
}
