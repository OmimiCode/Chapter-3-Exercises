//3.12 ( Invoice Class) Create a class called Invoice that a hardware store might use to represent
//        an invoice for an item sold at the store. An Invoice should include four pieces of information as
//        instance variables—a part number (type String ), a part description (type String ), a quantity of the
//        item being purchased (type int ) and a price per item ( double ). Your class should have a constructor
//        that initializes the four instance variables. Provide a set and a get method for each instance variable.
//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//        multiplies the quantity by the price per item), then returns the amount as a double value. If the
//        quantity is not positive, it should be set to 0 . If the price per item is not positive, it should be set to
//        0.0 . Write a test app named InvoiceTest that demonstrates class Invoice ’s capabilities.

public class Exercise3_12 {
    private String number;
    private String description;
    private int quantityOfItemPurchased = 0;
    private double pricePerItem = 0;
    private double invoiceAmount;


    //supposed to be public Invoice()

    public Exercise3_12(String number, String description, int quantityOfItemPurchased, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantityOfItemPurchased = quantityOfItemPurchased;
        this.pricePerItem = pricePerItem;


    }


    public void setNumber(String name) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantityOfItemPurchased(int quantityOfItemPurchased) {
        this.quantityOfItemPurchased = quantityOfItemPurchased;
    }

    public int getQuantityOfItemPurchased() {
        return quantityOfItemPurchased;
    }


    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//        multiplies the quantity by the price per item), then returns the amount as a double value. If the
//        quantity is not positive, it should be set to 0 . If the price per item is not positive, it should be set to
//        0.0 . Write a test app named InvoiceTest that demonstrates class Invoice ’s capabilities.


    public double getInvoiceAmount() {
        if (quantityOfItemPurchased > 0 && pricePerItem> 0) {
            invoiceAmount = quantityOfItemPurchased * pricePerItem;
        }else{
            System.out.println("input values greater than zero");
        }
        return invoiceAmount;
    }

}
