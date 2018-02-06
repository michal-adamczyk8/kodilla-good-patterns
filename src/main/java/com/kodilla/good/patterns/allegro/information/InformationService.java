package com.kodilla.good.patterns.allegro.information;

import com.kodilla.good.patterns.allegro.User;

public interface InformationService {
    void inform(User user, String product, double quantity, double price);
}

