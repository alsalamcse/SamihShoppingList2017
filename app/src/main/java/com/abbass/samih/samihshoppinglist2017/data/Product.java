package com.abbass.samih.samihshoppinglist2017.data;

/**
 * Created by samih on 11/6/2017.
 * This class represent a product that will be at the shopping list
 */
public class Product
{
    /**
     * the name of the product
     */
    private String name;
    /**
     * the price
     */
    private double price;
    private double amount;
    /**
     * if the product is bought.
     */
    private boolean isCompleted;
    /**
     * the path of product's image
     */
    private String imgPath;

    /**
     * a special key or id unique for each product (primary key)
     */
    private String keyId;

    /**
     *
     * @param name
     * @param price
     * @param amount
     */
    public Product(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        isCompleted=false;
        imgPath=null;
    }

    public Product(String name, double price, double amount, boolean isCompleted, String imgPath, String keyId) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.isCompleted = isCompleted;
        this.imgPath = imgPath;
        this.keyId = keyId;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
}
