package com.plan.utils.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MessengerVo implements Serializable{

    /** 业务参数集合 */
    private Map<String, Object> messenger;
    /** 响应码 */
    private String resCode = "0000";
    /** 描述信息 */
    private String resDesc = "成功";
    /** 客户端IP */
    private String clientIp;

    public MessengerVo(){
        this.messenger = new HashMap<>();
    }

    /** 获取map对象(messenger) */
    public String getString(String key){
        Object obj = messenger.get(key) == null ? "" : messenger.get(key);
        if (obj != null){
            if (obj.getClass().getSimpleName().equals("BigDecimal")){
                return ((BigDecimal)obj).toPlainString();
            }
        }
        return String.valueOf(obj);
    }

    public void clear(){
        messenger.clear();
    }

    public Map<String, Object> getMessenger() {
        return messenger;
    }

    public void setMessenger(Map<String, Object> messenger) {
        this.messenger = messenger;
    }

    /** put业务参数 */
    public void setInfo(String key, Object value) {
        messenger.put(key, value);
    }

    public String getResCode() {
        return resCode == null ? "" : resCode.trim();
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDesc() {
        return resDesc == null ? "" : resDesc.trim();
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getClientIp() {
        return clientIp == null ? "" : clientIp.trim();
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public String toString() {
        return "MessengerVo{" +
                "messenger=" + messenger +
                ", resCode='" + resCode + '\'' +
                ", resDesc='" + resDesc + '\'' +
                ", clientIp='" + clientIp + '\'' +
                '}';
    }
}
