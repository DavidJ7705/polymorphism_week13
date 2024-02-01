package ie.atu.productv4;

public class Television extends Product {

    private String Screen_Size;
    private String Manufacture;

    public Television() {
        super();
        Screen_Size = "";
        Manufacture = "";
        count++;
    }


    public void setScreen_Size(String Screen_Size) {
        this.Screen_Size = Screen_Size;
    }
    public String getScreen_Size() {return Screen_Size;}

    public String getManufacture() {return Manufacture;}

    public void setManufacture(String Manufacture) {this.Manufacture = Manufacture;}

    @Override
    public String toString() {return super.toString() + " by " + Manufacture + "\nScreen size is "+Screen_Size;}

}
