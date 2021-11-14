
package ucf.assignments;

import java.util.ArrayList;

public class AllLists {

    //Public ArrayList<ToDoList>  Is a 'lists' for all the to-do lists
    //Private ToDoList latestSave object for list

    public void addToDoList(ToDoList list){
        // new created ToDoList object
    }

    public void removeToDoList(ToDoList list){
        //loop through Arraylist<ToDoList> and find the given parameter object
        //remove it from the arraylist
    }

    public void saveAll(){
        //loop through all of the lists and it will save all of the lists to external storage
        //update the last saved list to latestSave
    }

    public ArrayList<ToDoList> loadAll(){
        //create a new Arraylist for saved lists
        //load in all of the lists to external storage into the new arraylist
        //returns the new arraylist of saved lists
        return null;
    }

    public void save(ToDoList list){
        //find the list through all lists ArrayList<ToDoList>
        //save only from that list
    }

    public ToDoList loadRecent(){
        //get list saved recently from latestSave object

        //return the latestSave object
        return null;
    }

    public Boolean listExists(ToDoList list){
        //checks whether the list exists in the AllLists arraylist of all lists
        //return true if exists and found, if else false
        return false; //right now false
    }

    public ArrayList<ToDoList> sort(ArrayList<ToDoList> lists){
        //declare and initialize new arraylist 'sortedLists'
        //sort the passed parameter using Comparator on item's getDate() date object
        //copy the contents of sort into sortedLists
        //return the sortedLists arraylist
        return null;
    }


}
