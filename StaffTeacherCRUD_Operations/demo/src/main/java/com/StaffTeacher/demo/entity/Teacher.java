package com.StaffTeacher.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="mobile")
    private int mobile;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    public Teacher(){

    }
    public Teacher(String firstName,String lastName,int mobile,String address,String email){
     this.firstName=firstName;
     this.lastName=lastName;
     this.mobile=mobile;
     this.address=address;
     this.email=email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public int getMobile(){
        return mobile;
    }

    public void setMobile(int mobile){
        this.mobile=mobile;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString(){
        return "Employee{"+
                "id="+id+
                ",firstName='"+firstName+'\''+
                ",lastName='"+lastName+'\''+
                ",email='"+email+'\''+
                "}";
    }
}
