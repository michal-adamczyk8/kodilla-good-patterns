package com.kodilla.good.patterns.allegro;

import com.kodilla.good.patterns.allegro.information.InformationService;
import com.kodilla.good.patterns.allegro.repository.PurchaseRepository;
import com.kodilla.good.patterns.allegro.service.PurchaseService;

public class ProductOrderService {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public ProductOrderService(final InformationService informationService, final PurchaseService purchaseService,
                               final PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(PurchaseRequest purchaseRequest){
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct(),
                purchaseRequest.getQuantity(), purchaseRequest.getPrice());
        if(isPurchased){
            informationService.inform(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getQuantity(),
                    purchaseRequest.getPrice());
            purchaseRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getQuantity(),
                    purchaseRequest.getPrice());
            return new PurchaseDto(purchaseRequest.getUser(), true);
        }
        else {
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}
