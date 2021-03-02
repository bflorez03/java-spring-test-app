package com.tempe.test.request.params;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class PriceRequestParams {

    private Long product;
    private Long brand;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime date;

    public Long getProduct() {
        return product;
    }

    public Long getBrand() {
        return brand;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
