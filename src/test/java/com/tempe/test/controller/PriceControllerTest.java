package com.tempe.test.controller;

import com.tempe.test.dto.PriceDTO;
import com.tempe.test.request.params.PriceRequestParams;
import com.tempe.test.service.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PriceController.class)
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceService service;

    @Test
    void getPrice_June14T00_00_00() throws Exception {
        final PriceRequestParams params = new PriceRequestParams();
        params.setBrand(1L);
        params.setProduct(35455L);
        params.setDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0));

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setBrand(1L);
        mockPrice.setProduct(35L);
        mockPrice.setPrice(BigDecimal.valueOf(30.35));
        mockPrice.setPriceList(1L);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59));

        given(this.service.retrieve(params)).willReturn(mockPrice);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/price")
                        .param("date", "2020-06-14T00:00:00")
                        .param("brand", "1")
                        .param("product", "35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void getPrice_June14T16_00_00() throws Exception {
        final PriceRequestParams params = new PriceRequestParams();
        params.setBrand(1L);
        params.setProduct(35455L);
        params.setDate(LocalDateTime.of(2020, Month.JUNE, 14, 16, 0, 0));

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setBrand(1L);
        mockPrice.setProduct(35L);
        mockPrice.setPrice(BigDecimal.valueOf(25.45));
        mockPrice.setPriceList(1L);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 14, 18, 30, 0));

        given(this.service.retrieve(params)).willReturn(mockPrice);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/price")
                        .param("date", "2020-06-14T16:00:00")
                        .param("brand", "1")
                        .param("product", "35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void getPrice_June14T21_00_00() throws Exception {
        final PriceRequestParams params = new PriceRequestParams();
        params.setBrand(1L);
        params.setProduct(35455L);
        params.setDate(LocalDateTime.of(2020, Month.JUNE, 14, 21, 0, 0));

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setBrand(1L);
        mockPrice.setProduct(35L);
        mockPrice.setPrice(BigDecimal.valueOf(30.35));
        mockPrice.setPriceList(1L);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59));

        given(this.service.retrieve(params)).willReturn(mockPrice);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/price")
                        .param("date", "2020-06-14T21:00:00")
                        .param("brand", "1")
                        .param("product", "35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void getPrice_June15T10_00_00() throws Exception {
        final PriceRequestParams params = new PriceRequestParams();
        params.setBrand(1L);
        params.setProduct(35455L);
        params.setDate(LocalDateTime.of(2020, Month.JUNE, 15, 10, 0, 0));

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setBrand(1L);
        mockPrice.setProduct(35L);
        mockPrice.setPrice(BigDecimal.valueOf(30.35));
        mockPrice.setPriceList(1L);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 15, 0, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 15, 11, 0, 0));

        given(this.service.retrieve(params)).willReturn(mockPrice);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/price")
                        .param("date", "2020-06-15T10:00:00")
                        .param("brand", "1")
                        .param("product", "35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void getPrice_June15T21_00_00() throws Exception {
        final PriceRequestParams params = new PriceRequestParams();
        params.setBrand(1L);
        params.setProduct(35455L);
        params.setDate(LocalDateTime.of(2020, Month.JUNE, 15, 21, 0, 0));

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setBrand(1L);
        mockPrice.setProduct(35L);
        mockPrice.setPrice(BigDecimal.valueOf(30.35));
        mockPrice.setPriceList(1L);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 15, 16, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59));

        given(this.service.retrieve(params)).willReturn(mockPrice);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/price")
                        .param("date", "2020-06-15T21:00:00")
                        .param("brand", "1")
                        .param("product", "35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}