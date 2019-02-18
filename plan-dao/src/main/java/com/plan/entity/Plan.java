package com.plan.entity;

import java.io.Serializable;
import java.util.Date;

public class  Plan implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.synopsis
     *
     * @mbggenerated
     */
    private String synopsis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.begin_time
     *
     * @mbggenerated
     */
    private Date beginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.insert_time
     *
     * @mbggenerated
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_plan.founder
     *
     * @mbggenerated
     */
    private String founder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.id
     *
     * @return the value of x_plan.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.id
     *
     * @param id the value for x_plan.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.title
     *
     * @return the value of x_plan.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.title
     *
     * @param title the value for x_plan.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.synopsis
     *
     * @return the value of x_plan.synopsis
     *
     * @mbggenerated
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.synopsis
     *
     * @param synopsis the value for x_plan.synopsis
     *
     * @mbggenerated
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.begin_time
     *
     * @return the value of x_plan.begin_time
     *
     * @mbggenerated
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.begin_time
     *
     * @param beginTime the value for x_plan.begin_time
     *
     * @mbggenerated
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.end_time
     *
     * @return the value of x_plan.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.end_time
     *
     * @param endTime the value for x_plan.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.status
     *
     * @return the value of x_plan.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.status
     *
     * @param status the value for x_plan.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.insert_time
     *
     * @return the value of x_plan.insert_time
     *
     * @mbggenerated
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.insert_time
     *
     * @param insertTime the value for x_plan.insert_time
     *
     * @mbggenerated
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.update_time
     *
     * @return the value of x_plan.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.update_time
     *
     * @param updateTime the value for x_plan.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_plan.founder
     *
     * @return the value of x_plan.founder
     *
     * @mbggenerated
     */
    public String getFounder() {
        return founder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_plan.founder
     *
     * @param founder the value for x_plan.founder
     *
     * @mbggenerated
     */
    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", founder='" + founder + '\'' +
                '}';
    }
}