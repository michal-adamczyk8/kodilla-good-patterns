package com.kodilla.good.patterns.allegro;

import com.kodilla.good.patterns.allegro.informationService.InformationService;
import com.kodilla.good.patterns.allegro.informationService.MailSender;
import com.kodilla.good.patterns.allegro.purchaseRepository.PurchasedSocksRepository;
import com.kodilla.good.patterns.allegro.purchaseService.PurchaseSocks;

public class AllegroRunner {
    public static void main(String[] args){
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailSender(), new PurchaseSocks(),
                new PurchasedSocksRepository());
        productOrderService.process(purchaseRequest);


    }
}
