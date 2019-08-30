package com.sprinboot.webflux.controllers;

import com.sprinboot.webflux.dao.MobileRepository;
import com.sprinboot.webflux.modal.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("mobile")
public class MobileController {

    @Autowired
    MobileRepository mobileRepsoitory;

    @PostMapping("/save")
    public Mono<Mobile> saveMobile(@RequestBody Mobile mobile){
        //System.out.println("saveMobile method is executing successfully");
        return  mobileRepsoitory.save(mobile);
    }

    @GetMapping("/{id}")
    public Mono<Mobile> getMobile(@PathVariable int id){
        return mobileRepsoitory.findById(id);

    }

    @GetMapping("get")
    public Flux<Mobile> getAllMobile(){
        return mobileRepsoitory.findAll();

    }
}
