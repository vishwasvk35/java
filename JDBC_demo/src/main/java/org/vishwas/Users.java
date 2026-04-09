package org.vishwas;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
    private int uID;
    private String name;
    private int age;

    public int getuID() {
        return uID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "users{" +
                "uID=" + uID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
