package com.sy.yuanfei.model.base;

public class Page {

    private Integer firstIndex = 0;
    /**
     * 每页显示条数
     */
    private Integer pageSize = 3;
    /**
     * 要显示的当前页
     */
    private Integer pageNow=1;
    /**
     * 数据库总记录数
     */
    private Integer count;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFirstIndex() {
        firstIndex = (pageNow-1)*pageSize;
        return firstIndex;
    }

    public void setFirstIndex(Integer firstIndex) {
        this.firstIndex = firstIndex;
    }
}
