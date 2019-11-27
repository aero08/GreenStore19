package com.example.greenstore19;

public class ShopData {

    private String ShopName;
    private String ShopDescription;
    private String ShopAddress;
    private String ShopImage;

    public ShopData() {
    }

    public ShopData(String shopName, String shopDescription, String shopAddress, String shopImage) {
        ShopName = shopName;
        ShopDescription = shopDescription;
        ShopAddress = shopAddress;
        ShopImage = shopImage;
    }

    public String getShopName() {
        return ShopName;
    }

    public String getShopDescription() {
        return ShopDescription;
    }

    public String getShopAddress() {
        return ShopAddress;
    }

    public String getShopImage() {
        return ShopImage;
    }

    public void setShopImage(String shopImage) {
        ShopImage = shopImage;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public void setShopDescription(String shopDescription) {
        ShopDescription = shopDescription;
    }

    public void setShopAddress(String shopAddress) {
        ShopAddress = shopAddress;
    }
}
