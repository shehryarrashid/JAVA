package Enum;

import java.util.ArrayList;

public class EnumMain {
    public static void main(String[] args) {
        ArrayList<ProductType> products = new ArrayList<ProductType>();
        products.add(ProductType.DRINK);
        products.add(ProductType.CLOTHING);
        for(ProductType type : ProductType.values()){
            System.out.println(type);
        }
        
    }
}
