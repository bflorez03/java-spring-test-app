package com.tempe.test.repository;

import com.tempe.test.model.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {

    Optional<List<Price>> findAllByProductAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(final Long product,
                                                                                                        final Long brand,
                                                                                                        final LocalDateTime startDate,
                                                                                                        final LocalDateTime endDate);
}
