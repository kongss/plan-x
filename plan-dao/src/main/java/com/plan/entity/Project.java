package com.plan.entity;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.insert_time
     *
     * @mbggenerated
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.begin_time
     *
     * @mbggenerated
     */
    private Date beginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.founder
     *
     * @mbggenerated
     */
    private String founder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_project.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.id
     *
     * @return the value of x_project.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.id
     *
     * @param id the value for x_project.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.name
     *
     * @return the value of x_project.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.name
     *
     * @param name the value for x_project.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.insert_time
     *
     * @return the value of x_project.insert_time
     *
     * @mbggenerated
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.insert_time
     *
     * @param insertTime the value for x_project.insert_time
     *
     * @mbggenerated
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.status
     *
     * @return the value of x_project.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.status
     *
     * @param status the value for x_project.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.end_time
     *
     * @return the value of x_project.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.end_time
     *
     * @param endTime the value for x_project.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.begin_time
     *
     * @return the value of x_project.begin_time
     *
     * @mbggenerated
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.begin_time
     *
     * @param beginTime the value for x_project.begin_time
     *
     * @mbggenerated
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.founder
     *
     * @return the value of x_project.founder
     *
     * @mbggenerated
     */
    public String getFounder() {
        return founder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.founder
     *
     * @param founder the value for x_project.founder
     *
     * @mbggenerated
     */
    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_project.update_time
     *
     * @return the value of x_project.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_project.update_time
     *
     * @param updateTime the value for x_project.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}