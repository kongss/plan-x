package com.plan.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_user.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_user.founder
     *
     * @mbggenerated
     */
    private String founder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_user.id
     *
     * @return the value of x_user.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_user.id
     *
     * @param id the value for x_user.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_user.name
     *
     * @return the value of x_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_user.name
     *
     * @param name the value for x_user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_user.founder
     *
     * @return the value of x_user.founder
     *
     * @mbggenerated
     */
    public String getFounder() {
        return founder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_user.founder
     *
     * @param founder the value for x_user.founder
     *
     * @mbggenerated
     */
    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }
}