package org.vishwas;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String area;
    private String city;

    public Address() {
        this.street="";
        this.area="";
        this.city="";
    }

    public Address(String street, String area, String city) {
        this.street = street;
        this.area = area;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
