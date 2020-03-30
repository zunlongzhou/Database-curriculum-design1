package com.dhu.team.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee_skill", schema = "curriculum_design", catalog = "")
@IdClass(EmployeeSkillPK.class)
public class EmployeeSkill {
    private int employeeId;
    private String employeeSkill;
    private String employeeTrain;
    private Date trainDate;

    @Id
    @Column(name = "employee_id")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "employee_skill")
    public String getEmployeeSkill() {
        return employeeSkill;
    }

    public void setEmployeeSkill(String employeeSkill) {
        this.employeeSkill = employeeSkill;
    }

    @Basic
    @Column(name = "employee_train")
    public String getEmployeeTrain() {
        return employeeTrain;
    }

    public void setEmployeeTrain(String employeeTrain) {
        this.employeeTrain = employeeTrain;
    }

    @Basic
    @Column(name = "train_date")
    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeSkill that = (EmployeeSkill) o;

        if (employeeId != that.employeeId) return false;
        if (employeeSkill != null ? !employeeSkill.equals(that.employeeSkill) : that.employeeSkill != null)
            return false;
        if (employeeTrain != null ? !employeeTrain.equals(that.employeeTrain) : that.employeeTrain != null)
            return false;
        if (trainDate != null ? !trainDate.equals(that.trainDate) : that.trainDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeSkill != null ? employeeSkill.hashCode() : 0);
        result = 31 * result + (employeeTrain != null ? employeeTrain.hashCode() : 0);
        result = 31 * result + (trainDate != null ? trainDate.hashCode() : 0);
        return result;
    }
}
