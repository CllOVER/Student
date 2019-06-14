package cn.cllover.administration.util;

import java.util.HashMap;
import java.util.Map;

/**通用返回类型
 * @author 18609
 *
 */
public class Status {

    //状态码202：成功     303：失败
    private int code;
    //提示信息
    private String msg;
    //用户要返回给浏览器的数据
    private Map<String,Object> userMsg = new HashMap();

    //提交成功状态
    public static Status success() {
        Status result = new Status();
        result.setCode(200);
        result.setMsg("状态码成功！");
        return result;
    }


    //提交成功失败
    public static Status fail() {
        Status result = new Status();
        result.setCode(100);
        result.setMsg("状态码失败！");
        return result;
    }


    //存储
    public Status add(String key,Object value) {
        this.getUserMsg().put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getUserMsg() {
        return userMsg;
    }

    public void setUserMsg(Map<String, Object> userMsg) {
        this.userMsg = userMsg;
    }


}
