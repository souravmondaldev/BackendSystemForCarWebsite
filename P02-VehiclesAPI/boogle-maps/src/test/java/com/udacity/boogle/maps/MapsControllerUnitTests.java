package com.udacity.boogle.maps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MapsController.class)
public class MapsControllerUnitTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getLocation() throws Exception {
        Double lat = 20.0;
        Double lon = 30.0;
        mockMvc.perform(get("/maps?lat=" + lat + "&lon=" + lon))
                .andExpect(status().isOk());
    }
}
