package com.OOPS;

import java.util.Objects;

public class GetterAndSetter {

    String name;
    int age;
    String dateOfBirth;
    boolean isValid;

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetterAndSetter that = (GetterAndSetter) o;
        return age == that.age && isValid == that.isValid && Objects.equals(name, that.name) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, isValid);
    }

    @Override
    public String toString() {
        return "GetterAndSetter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", isValid=" + isValid +
                '}';
    }

}
