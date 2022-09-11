package com.lob.ndeeddelivery.service;

import com.lob.ndeeddelivery.model.PurchaseHistory;
import com.lob.ndeeddelivery.projection.PurchasedItem;
import com.lob.ndeeddelivery.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public PurchaseHistory savePurchase(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);
    }

    @Override
    public List<PurchasedItem> findPurchasedItemsOfUser(Long userId) {
        return purchaseRepository.findAllUserPurchases(userId);
    }
}
