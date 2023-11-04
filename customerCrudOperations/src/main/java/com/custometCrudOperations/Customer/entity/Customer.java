package com.custometCrudOperations.Customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private int productPrice;

    public Customer(){

    }

    public Customer(String name,String address,String productName,int productPrice){
        this.name=name;
        this.address=address;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName=productName;
    }

    public int getProductPrice(){
        return productPrice;
    }

    public void setProductPrice(int productPrice){
        this.productPrice=productPrice;
    }

    @Override
    public String toString(){
        return "customer{"+
                "id="+id+
                ",name='"+name+'\''+
                ",address='"+address+'\''+
                ",productName='"+productName+'\''+
                ",productPrice='"+productPrice+'\''+
                "}";
    }

}
