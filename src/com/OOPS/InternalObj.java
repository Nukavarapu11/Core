package com.OOPS;

public class InternalObj {

    private int internalId;
    private String internalName;
    private String employeeType;

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "InternalObj{" +
                "internalId=" + internalId +
                ", internalName='" + internalName + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }
}
