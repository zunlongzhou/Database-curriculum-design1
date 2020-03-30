package com.dhu.team.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EmployeeSkillPK implements Serializable {
    private int employeeId;
    private String employeeSkill;

    @Column(name = "employee_id")
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "employee_skill")
    @Id
    public String getEmployeeSkill() {
        return employeeSkill;
    }

    public void setEmployeeSkill(String employeeSkill) {
        this.employeeSkill = employeeSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeSkillPK that = (EmployeeSkillPK) o;

        if (employeeId != that.employeeId) return false;
        if (employeeSkill != null ? !employeeSkill.equals(that.employeeSkill) : that.employeeSkill != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeSkill != null ? employeeSkill.hashCode() : 0);
        return result;
    }
}
