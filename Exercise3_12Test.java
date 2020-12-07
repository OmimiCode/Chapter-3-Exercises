import java.util.Arrays;

public class Exercise3_12Test {

    public static void main(String[] args) {
        Exercise3_12 invoice = new Exercise3_12("234","gucci Bag" ,24, 50.25 );

        double grade =  invoice.getInvoiceAmount();
        System.out.printf("%s%n%s%n%d%n%f%n%f%n", invoice.getNumber(),invoice.getDescription(),invoice.getQuantityOfItemPurchased(),invoice.getPricePerItem(),grade);


    }
}
