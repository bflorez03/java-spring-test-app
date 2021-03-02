package com.tempe.test.service;

import com.tempe.test.dto.PriceDTO;
import com.tempe.test.mapper.PriceMapper;
import com.tempe.test.model.Price;
import com.tempe.test.repository.PriceRepository;
import com.tempe.test.request.params.PriceRequestParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private PriceMapper priceMapper;

    public PriceDTO retrieve(final PriceRequestParams params) {
        Assert.notNull(params.getProduct(), "Date param can not be null");
        Assert.notNull(params.getProduct(), "Brand param can not be null");
        Assert.notNull(params.getProduct(), "Product param can not be null");

        List<Price> prices = this.priceRepository
                .findAllByProductAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                        params.getProduct(), params.getBrand(), params.getDate(), params.getDate())
                .orElse(new ArrayList<>());

        if (prices.size() < 1) {
            return null;
        }

        Price price = prices.stream()
                .sorted(Comparator.comparing(Price::getPriority).reversed()).collect(Collectors.toList())
                .get(0);

        return this.priceMapper.priceToPriceDTO(price);
    }
}
