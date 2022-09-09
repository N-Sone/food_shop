package com.lob.ndeeddelivery.projection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PurchasedItem {

    String getFoodName();
    BigDecimal getPrice();
    LocalDateTime getPurchaseTime();
}
