package parts;

import products.IProduct;

public interface IPart extends IProduct {
    String getManufacturer();
    long getPartNumber();
    void setManufacturer(String man);
    void setPartNumber(long num);
}
