package io;

import java.io.Serializable;
import java.util.Arrays;

public class PTSO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String email;

    public PTSO(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "PTSO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
