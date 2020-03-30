package com.dhu.team.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "former_employee", schema = "curriculum_design", catalog = "")
public class FormerEmployee {
    private int employeeId;
    private String employeeName;
    private String employeeSex;
    private String employeeDepartment;
    private String employeeEmail;
    private String employeeTelephone;
    private Date employeeEntryDate;
    private Date employeeDepartureDate;
    private Integer employeeLevel;

    @Id
    @Column(name = "employee_id")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "employee_sex")
    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    @Basic
    @Column(name = "employee_department")
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Basic
    @Column(name = "employee_email")
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Basic
    @Column(name = "employee_telephone")
    public String getEmployeeTelephone() {
        return employeeTelephone;
    }

    public void setEmployeeTelephone(String employeeTelephone) {
        this.employeeTelephone = employeeTelephone;
    }

    @Basic
    @Column(name = "employee_entry_date")
    public Date getEmployeeEntryDate() {
        return employeeEntryDate;
    }

    public void setEmployeeEntryDate(Date employeeEntryDate) {
        this.employeeEntryDate = employeeEntryDate;
    }

    @Basic
    @Column(name = "employee_departure_date")
    public Date getEmployeeDepartureDate() {
        return employeeDepartureDate;
    }

    public void setEmployeeDepartureDate(Date employeeDepartureDate) {
        this.employeeDepartureDate = employeeDepartureDate;
    }

    @Basic
    @Column(name = "employee_level")
    public Integer getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(Integer employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormerEmployee that = (FormerEmployee) o;

        if (employeeId != that.employeeId) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (employeeSex != null ? !employeeSex.equals(that.employeeSex) : that.employeeSex != null) return false;
        if (employeeDepartment != null ? !employeeDepartment.equals(that.employeeDepartment) : that.employeeDepartment != null)
            return false;
        if (employeeEmail != null ? !employeeEmail.equals(that.employeeEmail) : that.employeeEmail != null)
            return false;
        if (employeeTelephone != null ? !employeeTelephone.equals(that.employeeTelephone) : that.employeeTelephone != null)
            return false;
        if (employeeEntryDate != null ? !employeeEntryDate.equals(that.employeeEntryDate) : that.employeeEntryDate != null)
            return false;
        if (employeeDepartureDate != null ? !employeeDepartureDate.equals(that.employeeDepartureDate) : that.employeeDepartureDate != null)
            return false;
        if (employeeLevel != null ? !employeeLevel.equals(that.employeeLevel) : that.employeeLevel != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeeSex != null ? employeeSex.hashCode() : 0);
        result = 31 * result + (employeeDepartment != null ? employeeDepartment.hashCode() : 0);
        result = 31 * result + (employeeEmail != null ? employeeEmail.hashCode() : 0);
        result = 31 * result + (employeeTelephone != null ? employeeTelephone.hashCode() : 0);
        result = 31 * result + (employeeEntryDate != null ? employeeEntryDate.hashCode() : 0);
        result = 31 * result + (employeeDepartureDate != null ? employeeDepartureDate.hashCode() : 0);
        result = 31 * result + (employeeLevel != null ? employeeLevel.hashCode() : 0);
        return result;
    }
}
