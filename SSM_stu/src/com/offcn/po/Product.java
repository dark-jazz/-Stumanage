package com.offcn.po;

public class Product {
    private Integer id;

    private String name;

    private Double price;
    
    private Producttype pt;

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
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

	public Producttype getPt() {
		return pt;
	}

	public void setPt(Producttype pt) {
		this.pt = pt;
	}
    
    
    
}