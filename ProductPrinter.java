/* 
 * This is the ProductPrinter class
 * to be used in problem 3.14
 * You must add your code to this class
 *
 * name: Stephen Connelly
 * UNI: sjc2235
 */
 public class ProductPrinter{

    private String name;
    private double price;

    public ProductPrinter(String initName, double productPrice){
        name = initName;
        price = productPrice;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    
    public double reducePrice(){
        return price = price - 5;
    }

    
} //end of the class
