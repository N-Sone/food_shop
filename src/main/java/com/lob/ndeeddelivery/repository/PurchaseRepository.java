package com.lob.ndeeddelivery.repository;

import com.lob.ndeeddelivery.model.PurchaseHistory;
import com.lob.ndeeddelivery.projection.PurchasedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("select " +
            "f.foodName as foodName, ph.price as price, ph.purchaseTime as purchaseTime "
            + "from PurchaseHistory ph left join Food f on f.id = ph.id "
            + "where ph.userId = :userId")
    List<PurchasedItem> findAllUserPurchases(@Param("userId") Long userId);
}
