package org.vishwas;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;

@Entity
public class Users {
    @Id
    private int uID;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_aid")
    private Address address;

    public int getuID() {
        return uID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {return address;}

    public void setuID(int uID) {
        this.uID = uID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {this.address = address;}

    @Override
    public String toString() {
        return "users{" +
                "uID=" + uID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address= " + address +
                '}';
    }
}
