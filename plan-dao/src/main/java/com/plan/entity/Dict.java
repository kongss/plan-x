package com.plan.entity;

import java.io.Serializable;

public class Dict implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_dict.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_dict.code_type
     *
     * @mbggenerated
     */
    private String codeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_dict.code_type_desc
     *
     * @mbggenerated
     */
    private String codeTypeDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_dict.code_value
     *
     * @mbggenerated
     */
    private String codeValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_dict.code_value_desc
     *
     * @mbggenerated
     */
    private String codeValueDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_dict.id
     *
     * @return the value of x_dict.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_dict.id
     *
     * @param id the value for x_dict.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_dict.code_type
     *
     * @return the value of x_dict.code_type
     *
     * @mbggenerated
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_dict.code_type
     *
     * @param codeType the value for x_dict.code_type
     *
     * @mbggenerated
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_dict.code_type_desc
     *
     * @return the value of x_dict.code_type_desc
     *
     * @mbggenerated
     */
    public String getCodeTypeDesc() {
        return codeTypeDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_dict.code_type_desc
     *
     * @param codeTypeDesc the value for x_dict.code_type_desc
     *
     * @mbggenerated
     */
    public void setCodeTypeDesc(String codeTypeDesc) {
        this.codeTypeDesc = codeTypeDesc == null ? null : codeTypeDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_dict.code_value
     *
     * @return the value of x_dict.code_value
     *
     * @mbggenerated
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_dict.code_value
     *
     * @param codeValue the value for x_dict.code_value
     *
     * @mbggenerated
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_dict.code_value_desc
     *
     * @return the value of x_dict.code_value_desc
     *
     * @mbggenerated
     */
    public String getCodeValueDesc() {
        return codeValueDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_dict.code_value_desc
     *
     * @param codeValueDesc the value for x_dict.code_value_desc
     *
     * @mbggenerated
     */
    public void setCodeValueDesc(String codeValueDesc) {
        this.codeValueDesc = codeValueDesc == null ? null : codeValueDesc.trim();
    }
}