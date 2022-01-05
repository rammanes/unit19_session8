package com.company;

public class Items {

    private String item_name;
    private String item_manufacturer;

    public Items(String name, String manufacturer){
        this.item_name = name;
        this.item_manufacturer = manufacturer;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_manufacturer() {
        return item_manufacturer;
    }

    public void setItem_manufacturer(String item_manufacturer) {
        this.item_manufacturer = item_manufacturer;
    }

    @Override
    public String toString() {
        return "Items{" +
                "item_name='" + item_name + '\'' +
                ", item_manufacturer='" + item_manufacturer + '\'' +
                '}';
    }
}
