package cn.inslee.utils.web.result;

/**
 * 返回代码
 *
 * @author endy
 */
public enum ResultStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "请求无效"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "拒绝访问"),
    METHOD_NOT_ALLOWED(405, "请求方式不支持"),
    UNSUPPORTED_MEDIA_TYPE(415, "请求的实体类型不支持"),
    INTERNAL_SERVER_ERROR(500, "服务器开小差了"),
    SERVICE_UNAVAILABLE(503, "暂停服务");

    private final int code;
    private final String msg;

    ResultStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String msg() {
        return this.msg;
    }
}
