package com.kartik.sqlitedatabase.model;

public class EmpRecord {

    int id;

    public EmpRecord()
    {

    }

    public EmpRecord(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    String name , salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }




}
