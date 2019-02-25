package com.lemon.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lemon_plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE" ,nullable = false )
    private String title;

    @Column(name = "CREATE_USER_ID" ,nullable = false ,unique = true)
    private Long userId;

    @Column(name = "CREATE_TIME" ,nullable = true )
    private Date createTime;

    @Column(name = "END_TIME" ,nullable = true )
    private Date endTime;

    @Column(name = "COMPLIANCE_RATE" ,nullable = true )
    private double complianceRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getComplianceRate() {
        return complianceRate;
    }

    public void setComplianceRate(double complianceRate) {
        this.complianceRate = complianceRate;
    }
}
