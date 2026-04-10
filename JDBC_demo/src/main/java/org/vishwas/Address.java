package org.vishwas;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private int aid;
    private String street;
    private String area;
    private String city;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
        this.aid=0;
        this.street="";
        this.area="";
        this.city="";
    }

    public Address(int id, String street, String area, String city) {
        this.aid = id;
        this.street = street;
        this.area = area;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
