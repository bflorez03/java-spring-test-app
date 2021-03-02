package com.tempe.test.model;

import com.tempe.test.constants.CurrencyType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICE")
public class Price {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BRAND_ID", nullable = false)
    private Brand brand;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST", nullable = false)
    private Long priceList;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long product;

    @Column(name = "PRIORITY", nullable = false)
    private Long priority;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "CURR", columnDefinition = "CHAR(3)")
    private CurrencyType curr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Long getPriceList() {
        return priceList;
    }

    public void setPriceList(Long priceList) {
        this.priceList = priceList;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CurrencyType getCurr() {
        return curr;
    }

    public void setCurr(CurrencyType curr) {
        this.curr = curr;
    }
}
