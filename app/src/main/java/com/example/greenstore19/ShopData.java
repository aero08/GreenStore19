package com.example.greenstore19;

public class ShopData {

    private String ShopName;
    private String ShopDescription;
    private String ShopAddress;
    private int ShopImage;

    public ShopData(String shopName, String shopDescription, String shopAddress, int shopImage) {
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

    public int getShopImage() {
        return ShopImage;
    }
}
