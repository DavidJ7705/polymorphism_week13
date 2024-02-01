package ie.atu.productv4;



public class ProductDB {

    public static ie.atu.productv4.Product getProduct(String productCode) {

        Product myProduct = null;

        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        if (productCode.equalsIgnoreCase("java")) {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
         Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct=myBook;
        }

        if (productCode.equalsIgnoreCase("why")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Why ");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Dominic Fike");
            myMusic.setLabel("Columbia Records");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("sky")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Touch the Sky");
            myMusic.setPrice(1000000);
            myMusic.setArtist("Kanye West");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("fade")) {
            ie.atu.productv4.Music myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Imagine if ninja got a low taper fade");
            myMusic.setPrice(2.00);
            myMusic.setArtist("Ninja");
            myProduct=myMusic;
        }

        return myProduct;
        // In a more realistic application, this code would get the data for the product from a file or database
        // For now, this code just uses if/else statements to return the correct product data

        //We need all the book and software objects, but what kind of object do we return?
    }
}

