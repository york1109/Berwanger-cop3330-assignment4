/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brice Berwanger
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllListsTest {

    @Test
    void addToDoList_Test() {
        //create a temp ToDoList object
        //call addToDoList() by passing the temp ToDoList object

        //check whether the list has been added to all of the lists

        //assertTrue the boolean value from listExists()
    }

    //test whether new ToDoList list object is removed from all lists arrayList
    @Test
    void removeToDoList_Test() {
        //find a temp ToDoList object from all lists arrayList by rand
        //call removeToDoList() by passing the temp ToDoList object

        //check whether the list has been removed to all of the lists
    }

    //test whether all lists are saved to an external storage
    @Test
    void saveAll_Test() {
        //initialize few random lists and items object to 'lists' arrayList
        //call saveAll()

        //to check whether they are all saved call loadAll()
        //initialize the return value from loadAll() to new arrayList of ToDoList objects 'newLists'

        //assert whether the 'lists' and 'newLists' are same
    }

    //test whether all lists are loaded from an external storage
    @Test
    void loadAll_Test() {
        //initialize few random lists and items object to 'lists' arrayList
        //call saveAll()
        //then call loadAll()
        //initialize the return value from loadAll() to new arrayList of ToDoList objects 'newLists'

        //to check whether they are all loaded
        //assert whether the 'lists' and 'newLists' are same
    }

    //test whether a list is saved to an external storage
    @Test
    void save_Test() {
        //initialize few random items object to 'list' arrayList
        //call save() by passing 'list'

        //to check whether that list is saved call loadRecent()

    }
    
    @Test
    void loadRecent_Test() {
        //initialize few random items object to 'list' arrayList
        //call save() by passing 'list'
        //then call loadRecent()
        //initialize the return value from loadRecent() to new ToDoList object 'newList'

        //to check whether that list is loaded
        //assert whether the 'list' and 'newList' are same
    }

}