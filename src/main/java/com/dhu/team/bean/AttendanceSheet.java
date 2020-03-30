package com.dhu.team.bean;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "attendance_sheet", schema = "curriculum_design", catalog = "")
public class AttendanceSheet {
    private int employeeId;
    private Time checkInTime;

    @Id
    @Column(name = "employee_id")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

        AttendanceSheet that = (AttendanceSheet) o;

        if (employeeId != that.employeeId) return false;
        if (checkInTime != null ? !checkInTime.equals(that.checkInTime) : that.checkInTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (checkInTime != null ? checkInTime.hashCode() : 0);
        return result;
    }
}
