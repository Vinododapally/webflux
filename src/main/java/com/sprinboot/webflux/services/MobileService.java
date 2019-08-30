package com.sprinboot.webflux.services;

import com.sprinboot.webflux.modal.Mobile;

public interface MobileService {
    void createMobile(Mobile mobile);
    Mobile getMobile(int id);

}
