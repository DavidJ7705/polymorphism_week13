package ie.atu.productv4;

import ie.atu.productv3.Book;
import ie.atu.productv3.Product;
import ie.atu.productv3.Software;

public class ProductDB {

    public static ie.atu.productv3.Product getProduct(String productCode) {

        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            ie.atu.productv3.Software mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            ie.atu.productv3.Software mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            ie.atu.productv3.Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        if (productCode.equalsIgnoreCase("java")) {
            ie.atu.productv3.Book myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            ie.atu.productv3.Book myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            ie.atu.productv3.Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct=myBook;
        }

        if (productCode.equalsIgnoreCase("java")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Why ");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Dominic Fike");
            myMusic.setLabel("Columbia Records");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("ATU Java Programming");
            myMusic.setPrice(57.50);
            myMusic.setArtist("Joe Brown");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("Fortnite")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("ATU Java Programming");
            myMusic.setPrice(57.50);
            myMusic.setArtist(" ");
            myProduct=myMusic;
        }

        return myProduct;
        // In a more realistic application, this code would get the data for the product from a file or database
        // For now, this code just uses if/else statements to return the correct product data

        //We need all the book and software objects, but what kind of object do we return?
    }
}

