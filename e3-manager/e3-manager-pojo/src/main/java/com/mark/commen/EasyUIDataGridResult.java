package com.mark.commen;

import java.util.List;

/**
 * Created by mk on 2018/3/20.
 */
public class EasyUIDataGridResult {

    private Long total;

    private List<?> rows;

    public EasyUIDataGridResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
