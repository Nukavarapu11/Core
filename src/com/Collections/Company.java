package com.Collections;

public class Company implements Comparable<Company> {

    private String name;
    private int employees;
    private int count;
    private String type;
    private String services;

    Company(String name, int employees, int count, String type, String services) {
        this.name = name;
        this.employees = employees;
        this.count = count;
        this.type = type;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String revenue) {
        this.services = revenue;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", revenue=" + services +
                '}';
    }

    @Override
    public int compareTo(Company o) {
        return  -this.services.compareTo(o.services);
    }
}
