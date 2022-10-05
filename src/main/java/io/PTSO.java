package io;

import java.io.Serializable;
import java.util.Arrays;

public class PTSO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient String[] another;

    public PTSO(String name, int age, String[] another) {
        this.name = name;
        this.age = age;
        this.another = another;
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
    public String[] getAnother() {
        return another;
    }
    public void setAnother(String[] another) {
        this.another = another;
    }

    @Override
    public String toString() {
        return "PTSO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", another=" + Arrays.toString(another) +
                '}';
    }
}
