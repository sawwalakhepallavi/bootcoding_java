package com.bootcoding.oops;

public class Fan {
    private String company;
    private int price;
    private long sale;
    private String color;

    @Override
    public String toString() {
        return "Fan{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", color='" + color + '\'' +
                '}';
    }

    public Fan(String company, int price, long sale, String color) {
        this.company = company;
        this.price = price;
        this.sale = sale;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getSale() {
        return sale;
    }

    public void setSale(long sale) {
        this.sale = sale;
    }
}
