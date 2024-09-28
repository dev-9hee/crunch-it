package com.kb.mydata.entity.serializable;

import java.io.Serializable;
import java.util.Objects;

public class UserStockId implements Serializable {
    private String stockCode;
    private int userId;

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserStockId that = (UserStockId) o;
        return userId == that.userId && Objects.equals(stockCode, that.stockCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockCode, userId);
    }

}