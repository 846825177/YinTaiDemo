package com.example.administrator.yintaidemo.entity;

/**
 * Created by Mr Chen on 2017/10/25.
 */

public class Data {

    /**
     * query_string : N=50000111
     * displaycount : 30
     * order_type : 5
     * page_index : 1
     * keyword :
     */

    private String query_string;
    private String displaycount;
    private String order_type;
    private String page_index;
    private String keyword;

    public String getQuery_string() {
        return query_string;
    }

    public void setQuery_string(String query_string) {
        this.query_string = query_string;
    }

    public String getDisplaycount() {
        return displaycount;
    }

    public void setDisplaycount(String displaycount) {
        this.displaycount = displaycount;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public String getPage_index() {
        return page_index;
    }

    public void setPage_index(String page_index) {
        this.page_index = page_index;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
