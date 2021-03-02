package com.tempe.test.controller;

import com.tempe.test.dto.PriceDTO;
import com.tempe.test.request.params.PriceRequestParams;
import com.tempe.test.service.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @RequestMapping(value = "/price", method = RequestMethod.GET)
    public ResponseEntity<PriceDTO> getPrice(final PriceRequestParams params) {
        return ResponseEntity.ok(this.priceService.retrieve(params));
    }
}
