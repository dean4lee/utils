package cn.inslee.utils.web.result;

import java.io.Serializable;

/**
 * json统一返回结果
 *
 * @author endy
 */
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -4339131942017375853L;

    public static final boolean SUCCESS = true;
    public static final boolean FAIL = false;

    /**
     * 返回的状态
     */
    private boolean status;
    /**
     * 返回的代码
     */
    private int code;
    /**
     * 返回的信息
     */
    private String msg;
    /**
     * 返回的数据
     */
    private Object data;

    public JsonResult() {
    }

    public JsonResult(boolean status, int code, String msg, Object data) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult success() {
        return new JsonResult(SUCCESS, ResultStatus.OK.code(), ResultStatus.OK.msg(), null);
    }

    public static JsonResult success(Object data) {
        return new JsonResult(SUCCESS, ResultStatus.OK.code(), ResultStatus.OK.msg(), data);
    }

    /**
     * 默认的错误代码是400
     *
     * @param msg
     * @return
     */
    public static JsonResult fail(String msg) {
        return fail(ResultStatus.BAD_REQUEST.code(), msg);
    }

    public static JsonResult fail(ResultStatus resultStatus) {
        return fail(resultStatus.code(), resultStatus.msg());
    }

    public static JsonResult fail(int code, String msg) {
        return new JsonResult(FAIL, code, msg, null);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
