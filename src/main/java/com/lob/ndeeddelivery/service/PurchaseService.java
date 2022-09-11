package com.lob.ndeeddelivery.service;

import com.lob.ndeeddelivery.model.PurchaseHistory;
import com.lob.ndeeddelivery.model.User;
import com.lob.ndeeddelivery.projection.PurchasedItem;

import java.util.List;

public interface PurchaseService {

    PurchaseHistory savePurchase(PurchaseHistory purchaseHistory);
    List<PurchasedItem> findPurchasedItemsOfUser(Long userId);
}
