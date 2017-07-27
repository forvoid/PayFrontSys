package com.jiupai.payFrontSys.service;

import java.io.Serializable;

/**
 * Created by forvoid on 7/24/2017.
 */
public class TestBo implements Serializable {
    Integer page;
    Integer rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
