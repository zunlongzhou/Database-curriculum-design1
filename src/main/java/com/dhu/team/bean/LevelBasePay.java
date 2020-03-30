package com.dhu.team.bean;

import javax.persistence.*;

@Entity
@Table(name = "level_base_pay", schema = "curriculum_design", catalog = "")
public class LevelBasePay {
    private int level;
    private Integer basePay;

    @Id
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "base_pay")
    public Integer getBasePay() {
        return basePay;
    }

    public void setBasePay(Integer basePay) {
        this.basePay = basePay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LevelBasePay that = (LevelBasePay) o;

        if (level != that.level) return false;
        if (basePay != null ? !basePay.equals(that.basePay) : that.basePay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = level;
        result = 31 * result + (basePay != null ? basePay.hashCode() : 0);
        return result;
    }
}
