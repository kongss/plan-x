package com.plan.utils.status;

public enum PConstants {

    SUCCESS("0000", "成功", "0"),
    FAIL("0000", "失败", "0"),
    ERROR("0000", "异常", "0"),
    NOT_LOGIN("0000", "未登录", "0"),



    ;
    private String code;
    private String msg;
    private String flag;

    PConstants(String code, String msg, String flag) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
