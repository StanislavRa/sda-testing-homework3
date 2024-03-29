package com.sdatesthomework3.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author StanislavR
 */
@SpringBootTest
@AutoConfigureMockMvc
public class ReservationControllerTestWithoutServerAllLayers {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturn200AndResponse() throws Exception {

        mockMvc.perform(get("/success"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Reservation is completed successfully"));
    }
}
