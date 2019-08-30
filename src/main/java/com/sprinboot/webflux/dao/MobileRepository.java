package com.sprinboot.webflux.dao;

import com.sprinboot.webflux.modal.Mobile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MobileRepository extends ReactiveMongoRepository<Mobile, Integer> {
}
