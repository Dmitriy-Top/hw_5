package ru.hw_5.Utilites.Commands;

import ru.hw_5.Entity.Product;

import java.util.ArrayList;

/**
 * Created by admin on 22.11.2016.
 */
public class CartDAO {
    private static ArrayList<Product> cart = new ArrayList<Product>();

    public static Product get(int id){
        Product result = cart.get(id-1);

        return result;
    }
    public static void create(Product product){
        cart.add(product);
    }
    public static void update(Product product){
        int id = product.getId();
        int index = -1;
        for (Product prd : cart){
            if (prd.getId()==id) index = cart.indexOf(prd);
        }
        cart.remove(index);
        cart.add(index,product);
    }
    public static void delete(int id){
        int index = -1;
        for (Product prd : cart){
            if (prd.getId()==id) index = cart.indexOf(prd);
        }
        cart.remove(index);
    }

    public static int getSize(){
        return cart.size();
    }

    private CartDAO() {
    }
}
