package com.polytech.offer.models;

import java.io.Serializable;

public class JSJoinOfferId implements Serializable {

    private Long jsId;

    private Long offerId;

    public JSJoinOfferId(Long jsId, Long offerId) {
        this.jsId = jsId;
        this.offerId = offerId;
    }
}
