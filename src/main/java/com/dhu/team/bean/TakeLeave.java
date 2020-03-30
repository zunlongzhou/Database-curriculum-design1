package com.dhu.team.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "take_leave", schema = "curriculum_design", catalog = "")
public class TakeLeave {
    private int leaveId;
    private Integer employeeId;
    private Integer approveEmployeeId;
    private Date leaveStartDate;
    private Date leaveEndDate;
    private String leaveInfo;

    @Id
    @Column(name = "leave_id")
    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
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
    @Column(name = "approve_employee_id")
    public Integer getApproveEmployeeId() {
        return approveEmployeeId;
    }

    public void setApproveEmployeeId(Integer approveEmployeeId) {
        this.approveEmployeeId = approveEmployeeId;
    }

    @Basic
    @Column(name = "leave_start_date")
    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    @Basic
    @Column(name = "leave_end_date")
    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    @Basic
    @Column(name = "leave_info")
    public String getLeaveInfo() {
        return leaveInfo;
    }

    public void setLeaveInfo(String leaveInfo) {
        this.leaveInfo = leaveInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TakeLeave takeLeave = (TakeLeave) o;

        if (leaveId != takeLeave.leaveId) return false;
        if (employeeId != null ? !employeeId.equals(takeLeave.employeeId) : takeLeave.employeeId != null) return false;
        if (approveEmployeeId != null ? !approveEmployeeId.equals(takeLeave.approveEmployeeId) : takeLeave.approveEmployeeId != null)
            return false;
        if (leaveStartDate != null ? !leaveStartDate.equals(takeLeave.leaveStartDate) : takeLeave.leaveStartDate != null)
            return false;
        if (leaveEndDate != null ? !leaveEndDate.equals(takeLeave.leaveEndDate) : takeLeave.leaveEndDate != null)
            return false;
        if (leaveInfo != null ? !leaveInfo.equals(takeLeave.leaveInfo) : takeLeave.leaveInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = leaveId;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (approveEmployeeId != null ? approveEmployeeId.hashCode() : 0);
        result = 31 * result + (leaveStartDate != null ? leaveStartDate.hashCode() : 0);
        result = 31 * result + (leaveEndDate != null ? leaveEndDate.hashCode() : 0);
        result = 31 * result + (leaveInfo != null ? leaveInfo.hashCode() : 0);
        return result;
    }
}
