/* 
 * This is the Product class
 * to be used in problem 3.14
 * You must add your code to this class
 *
 * name:Stephen Connelly
 * UNI:sjc2235
 */
 public class Product {
    
    public static void main(String[] args){
        ProductPrinter product1;
        ProductPrinter product2;
        product1 = new ProductPrinter("Television", 70.99);
        product2 = new ProductPrinter("Your Soul", 9.99);

        String product1name;
        product1name = product1.getName();

        double product1Price; 
        product1Price = product1.getPrice();
        System.out.println("The price of " + product1name + " before the discount is " 
        + product1Price);

        String product2name;
        product2name = product2.getName();

        double product2Price; 
        product2Price = product2.getPrice();
        System.out.println("The price of " + product2name + " before the discount is " 
        + product2Price);

        double discountPrice;
        discountPrice = product1.reducePrice();
        System.out.println("The discounted price of " + product1name + " is " 
        + discountPrice);

        double discount2Price;
        discount2Price = product2.reducePrice();
        System.out.println("The discounted price of " + product2name + " is " 
        + discount2Price);
    }
} 
