package ru.hw_5.Entity;

/**
 * Created by admin on 21.11.2016.
 */
public class Product extends AbstractProduct{
    private static int idCounter;
    private int id;
    private String name;
    private float price;
    private int categoryID;

    public Product(String name, float price, int categoryID) {
        Product.idCounterPlus();
        this.name = name;
        this.price = price;
        this.categoryID = categoryID;
        this.id = Product.idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    public int getId() {
        return id;
    }

    public static void idCounterPlus(){
        idCounter +=1;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    @Override
    public String toString() {
        return String.format("Название: %s , стоимость: %d руб., id продукта: %d.\n",name,price,id);
    }
}
