package com.lemon.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lemon_weight")
public class Weight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WEIGHT" ,nullable = false )
    private String weight;

    @Column(name = "USER_ID" ,nullable = false ,unique = true)
    private Long userId;

    @Column(name = "CREATE_TIME" ,nullable = false )
    private Date createTime;

    @Column(name = "REMARK" ,nullable = true )
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
