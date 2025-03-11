public class ProductData {
    public static void main(String[] args){
        totalProduct product1 = new totalProduct("Chips",20);
        totalProduct product2 = new totalProduct("ColdDrink",40);
        totalProduct product3 = new totalProduct("Biscuit",10);
        //display each product
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();

        //display total count
        totalProduct.displayTotalCount();
    }
}
//defining totalProducts class
class totalProduct{
    String productName;
    int price;
    static int totalProducts = 0;
    //constructor for totalProducts class
    public totalProduct(String productName,int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    //display each product
    public void displayProduct(){
        System.out.println("Product name "+productName);
        System.out.println("Product price "+price);
        System.out.println();
    }
    //display total product count
    public static void displayTotalCount(){
        System.out.println("Total product count "+totalProducts);
    }
}

//output
//Product name Chips
//Product price 20
//
//Product name ColdDrink
//Product price 40
//
//Product name Biscuit
//Product price 10
//
//Total product count 3
