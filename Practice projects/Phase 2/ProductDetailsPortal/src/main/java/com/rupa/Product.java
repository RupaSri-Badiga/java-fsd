package com.rupa;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
	private String color;
    public Product(String name,String color, double price) {
        this.setName(name);
        this.setColor(color);
        this.setPrice(price);
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}