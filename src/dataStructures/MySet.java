package dataStructures;


public class MySet{
    private MyArrayList mySet = new MyArrayList();

    public void addElementToList(String element){
        mySet.addElementToList(element);
    }

    public String getElementByIndex(int index) {
        return mySet.getElementByIndex(index);
    }

    public void addMultipleElementsToList(String... elements){
        mySet.addMultipleElementsToList(elements);
    }

    public int getCount() {
        return mySet.getCount();
    }
}
