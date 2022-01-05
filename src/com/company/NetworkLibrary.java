package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class NetworkLibrary {
    //private LinkedList item_list = new LinkedList();
    private LinkedList<Items> item_list = new LinkedList();
    Scanner input = new Scanner(System.in);


    private Items createNewItem(){
        System.out.print("Enter item name :");
        String item_name = input.nextLine();
        System.out.print("Enter item manufacturer :");
        String manufacturer = input.nextLine();

        Items newItem = new Items(item_name, manufacturer);
        return newItem;
    }

    public void addItemFirst(){
        Items item = createNewItem();
        item_list.addFirst(item);
    }
    public void addItemLast(){
        Items item = createNewItem();
        item_list.addLast(item);
    }
    public void display(){
        var item_iterator = item_list.iterator();
        while(item_iterator.hasNext())
            System.out.println(item_iterator.next());
    }
    public void findItemByName(String name){
        for(Items item : item_list){
            if(item.getItem_name().equals(name))
                System.out.println("Item exists");
            else
                System.out.println("item not found");
        }
    }
    public void updateItems(){
        System.out.println("Enter the attribute to update or enter cancel to quit :");
        System.out.println("Cancel : To cancel");
        System.out.println("Manufacturer: To update manufacture");
        System.out.println("Name: to update item name");
        String user_response= input.nextLine().toLowerCase(Locale.ROOT);
        if(!user_response.toLowerCase().equals("cancel")) {
            switch (user_response) {
                case ("manufacturer"):

                    break;
                case("name"):

            }
        }else
            System.out.println("You cancelled the operation");

    }

    public void updateMethod(String param){
        System.out.println("Enter the item  "+param+" you want to update");
        String update_m = input.nextLine();
        for(Items item : item_list){
            if (!item.getItem_manufacturer().equals(update_m))
                System.out.println("No such  "+param+ " in records");
            else{
                item.setItem_manufacturer(update_m);
                System.out.println( param+" updated");
            }
        }
    }

}
