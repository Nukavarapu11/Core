package com.OOPS;

public class ObjectTest {

    private String name;
    private String company;
    private int id;
    private InternalObj internalObj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InternalObj getInternalObj() {
        return internalObj;
    }

    public void setInternalObj(InternalObj internalObj) {
        this.internalObj = internalObj;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", id=" + id +
                ", internalObj=" + internalObj +
                '}';
    }
}
