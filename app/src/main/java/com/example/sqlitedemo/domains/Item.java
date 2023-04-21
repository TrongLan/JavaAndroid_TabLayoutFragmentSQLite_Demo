package com.example.sqlitedemo.domains;

public class Item {
  private Integer id;
  private String name;
  private Double price;
  private String date;
  private Category category;

  public Item(Integer id, String name, Double price, String date, Category category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.date = date;
    this.category = category;
  }

  public Item() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
