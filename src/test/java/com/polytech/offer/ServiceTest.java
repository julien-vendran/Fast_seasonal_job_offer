package com.polytech.offer;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.repository.OfferRepository;
import com.polytech.offer.services.OfferService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {
    @Autowired
    private OfferService offerService;

    @MockBean
    private OfferRepository offerRepository;
/*
    @Test
    @DisplayName("Test find by id success")
    public void testFindByIdSuccess(){
        OfferEntity mockOffer = new OfferEntity( 1L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        doReturn(Optional.of(mockOffer)).when(offerRepository).findById(1L);

        Optional<OfferEntity> returnedOffer = offerService.getById(1L);
        Assertions.assertTrue(returnedOffer.isPresent(), "Offer was not found");
        Assertions.assertSame(returnedOffer.get(),mockOffer, "Offers should bethe same");
    }

    @Test
    @DisplayName("Test find by id not found")
    public void testFindByIdNotFound(){
        OfferEntity mockOffer = new OfferEntity( 1L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        doReturn(Optional.empty()).when(offerRepository).findById(1L);

        Optional<OfferEntity> returnedOffer = offerService.getById(1L);

        Assertions.assertFalse(returnedOffer.isPresent(), "Offer was found when it shouldn't be");


    }

    @Test
    @DisplayName("Test get all")
    public void testGetAll(){
        OfferEntity mockOffer = new OfferEntity( 1L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        OfferEntity mockOffer2 = new OfferEntity( 2L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        doReturn(Arrays.asList(mockOffer,mockOffer2)).when(offerRepository).findAll();

        List<OfferEntity> offers = (List) offerService.getAll();

        Assertions.assertEquals(2, offers.size(),"get All should return 2 offers");
    }


    @Test
    @DisplayName("Test create offer")
    public void testSave(){
        OfferEntity mockOffer = new OfferEntity( 1L,"dev","stage de dev", new Date(), new Date(), "Montpellier",2, 1200.3, "tickets restau", "dev java", "Occitanie", "moi", "dev ambiance");
        doReturn(mockOffer).when(offerRepository).save(any());

        OfferEntity returnedOffer = offerService.createOrUpdate(mockOffer);

        Assertions.assertNotNull(returnedOffer, "saved offer should be not null");
    }*/
}
