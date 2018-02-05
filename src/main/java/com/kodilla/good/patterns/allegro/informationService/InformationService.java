package com.kodilla.good.patterns.allegro.informationService;

import com.kodilla.good.patterns.allegro.User;

public interface InformationService {
    void inform(User user, String product, double quantity, double price);
}

