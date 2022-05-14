package com.generic_corp.demoapplicationmadebyekaghni;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class model_for_outer_data {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("employee_name")
    @Expose
    private String employee_name;
    @SerializedName("employee_salary")
    @Expose
    private String employee_salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }
}
