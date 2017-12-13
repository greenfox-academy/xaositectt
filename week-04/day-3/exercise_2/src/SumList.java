/*Create a sum method in your class which has an ArrayList of Integers as parameter
It should return the sum of the elements in the list
Follow these steps:
Add a new test case
Instantiate your class
create a list of integers
use the assertEquals to test the result of the created sum method
Run them
Create different tests where you
test your method with an empyt list
with a list with one element in it
with multiple elements in it
with a null
Run them
Fix your code if needed*/

import java.util.ArrayList;

public class SumList {
  private ArrayList<Integer> myList;

  public SumList() {
    myList=new ArrayList<>();
  }

  public void addElement(int myInt){
    this.getMyList().add(myInt);
  }

  public ArrayList<Integer> getMyList() {
    return myList;
  }

  public int getElement(int i) {
    return this.getMyList().get(i);
  }

  public void setMyList(ArrayList<Integer> myList) {
    this.myList = myList;
  }

  public int sumListIntegers() {
    int sum=0;
    for (int element: this.getMyList()) {
      sum=sum+element;
    }
    return sum;
  }
}
