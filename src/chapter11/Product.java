package chapter11;

public interface Product {
// some invalid declarations:
//    public int size;
//    abstract public int size;
//    protected int size;
    int size =0; // this is valid

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    //default method does not have to be implemented in subclasses.
    default String getBarcode(){
        return "no barcode";
    }
}
