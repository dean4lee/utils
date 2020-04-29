package cn.inslee.utils.web.result;

import java.util.Collection;

/**
 * 分页返回结果
 *
 * @author endy
 */
public class PageResult<T> extends JsonResult<T> {
    /**
     * 数据的总条数
     */
    private long total;

    public PageResult(boolean status, int code, String msg, T data, long total) {
        super(status, code, msg, data);
        this.total = total;
    }

    public static PageResult success(Collection<?> data, long total) {
        return new PageResult(SUCCESS, ResultStatus.OK.code(), ResultStatus.OK.msg(), data, total);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                "} " + super.toString();
    }
}
