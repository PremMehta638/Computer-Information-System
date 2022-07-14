/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer_Comrade;

/*
 * @author Prem Kumar Mehta
 * @author Bishal Kumar Sardar
 * @author Yogesh Dahal
 */
public class ComputerComrade {
     private String modelNumber, name, category, discount, range;
    private int price;

    public ComputerComrade(String modelNumber, String name, String category, String range, int price, String discount) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.category = category;
        this.discount = discount;
        this.range = range;
        this.price = price;
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    
    public String getRange() {
        return range;
    }

    public String getDiscount() {
        return discount;
    }
    
    public int getPrice() {
        return price;
    }
}
