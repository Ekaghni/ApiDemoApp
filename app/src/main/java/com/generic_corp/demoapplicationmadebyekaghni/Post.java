package com.generic_corp.demoapplicationmadebyekaghni;

public class Post {

    public String id,employee_name,employee_salary;

    public Post(String id, String employee_name, String employee_salary) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public String getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }
}
