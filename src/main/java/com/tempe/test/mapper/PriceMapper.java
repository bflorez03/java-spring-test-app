package com.tempe.test.mapper;

import com.tempe.test.dto.PriceDTO;
import com.tempe.test.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    @Mapping(target = "brand", source = "brand.id")
    PriceDTO priceToPriceDTO(Price e);
}
