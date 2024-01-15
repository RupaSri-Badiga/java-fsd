package com.ecommerce;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "name")
private String name;
@Column(name = "description")
private String description;
@Column(name = "price")
private double price;
// Constructors, getters, and setters
public Product() {
super();
// TODO Auto-generated constructor stub
}
public int getId() { return id; }
public void setId(int id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getDescription() { return description; }
public void setDescription(String description) { this.description = 
description; }
public double getPrice() { return price; }
public void setPrice(double price) { this.price = price; }
@Override
public String toString() {
return "Product [id=" + id + ", name=" + name + ", description=" + 
description + ", price=" + price + "]";
}
}
