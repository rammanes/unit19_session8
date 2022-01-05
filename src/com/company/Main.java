package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
      NetworkLibrary library = new NetworkLibrary();
      library.addItemFirst();
      library.display();
      library.findItemByName("Samsung");
      library.display();
      library.updateItems();
    }
}
