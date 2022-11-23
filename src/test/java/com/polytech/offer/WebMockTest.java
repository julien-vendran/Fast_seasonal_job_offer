package com.polytech.offer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.polytech.offer.controllers.OfferController;
import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//Faire des tests avec mockito limités à la couche web
@WebMvcTest(OfferController.class)
public class WebMockTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OfferService offerService;

    @Test
    @DisplayName("GET / else return well string")
    public void elseShouldReturnMessageFromService() throws Exception {
        when(this.offerService.health()).thenReturn("No error");
        this.mockMvc.perform(get("/api/offer/else")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string(containsString("No error")));
    }

 /*   @Test
    @DisplayName("POST /offer/create - Success")
    public void createOfferTest() throws Exception {
        OfferEntity postOffer = new OfferEntity( null,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        OfferEntity mockOffer = new OfferEntity( 1L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        doReturn(mockOffer).when(offerService).createOrUpdate(any());

        mockMvc.perform(post("/api/offer/createOrUpdate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(postOffer)))
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.LOCATION, "/api/offer/createOrUpdate/"));

    }

    public static String asJsonString(finamockMvcl Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
}
