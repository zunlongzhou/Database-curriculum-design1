package com.dhu.team.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Absence {
    private int absenceId;
    private Integer employeeId;
    private Date absenceDate;
    private Time checkInTime;

    @Id
    @Column(name = "absence_id")
    public int getAbsenceId() {
        return absenceId;
    }

    public void setAbsenceId(int absenceId) {
        this.absenceId = absenceId;
    }

    @Basic
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "absence_date")
    public Date getAbsenceDate() {
        return absenceDate;
    }

    public void setAbsenceDate(Date absenceDate) {
        this.absenceDate = absenceDate;
    }

    @Basic
    @Column(name = "check_in_time")
    public Time getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Time checkInTime) {
        this.checkInTime = checkInTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Absence absence = (Absence) o;

        if (absenceId != absence.absenceId) return false;
        if (employeeId != null ? !employeeId.equals(absence.employeeId) : absence.employeeId != null) return false;
        if (absenceDate != null ? !absenceDate.equals(absence.absenceDate) : absence.absenceDate != null) return false;
        if (checkInTime != null ? !checkInTime.equals(absence.checkInTime) : absence.checkInTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = absenceId;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (absenceDate != null ? absenceDate.hashCode() : 0);
        result = 31 * result + (checkInTime != null ? checkInTime.hashCode() : 0);
        return result;
    }
}
