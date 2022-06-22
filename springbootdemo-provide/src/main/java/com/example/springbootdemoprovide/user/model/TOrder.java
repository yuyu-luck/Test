package com.example.springbootdemoprovide.user.model;

import java.io.Serializable;

/**
 * 订单表
 *
 * @TableName t_order
 */
public class TOrder implements Serializable {
    /**
     *
     */
    private Integer rid;

    /**
     *
     */
    private String rname;

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getRid() {
        return rid;
    }

    /**
     *
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     *
     */
    public String getRname() {
        return rname;
    }

    /**
     *
     */
    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TOrder other = (TOrder) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getRname() == null ? other.getRname() == null : this.getRname().equals(other.getRname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRname() == null) ? 0 : getRname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rname=").append(rname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}